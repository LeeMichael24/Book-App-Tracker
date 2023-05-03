package com.example.booktrackerapp.data



    val autor1 = Author(
        firstname = "Stephen",
        lastname = "King",
        nationality = "American",
        birthDate = "September 21, 1947",
        bio = "Stephen King is a bestselling author known for his horror and suspense novels."
    )

    val editorial1 = Publisher(
        name = "Doubleday",
        location = "New York",
        website = "https://www.penguinrandomhouse.com/imprints/doubleday/",
        foundingYear = 1897
    )

    val libro1 = Book(
        title = "The Stand",
        authors = listOf(autor1),
        publisher = editorial1,
        publicationYear = "1978",
        pageCount = 823,
        subject = "Horror, post-apocalyptic fiction",
        summary = "The Stand is a post-apocalyptic horror novel by Stephen King about a pandemic that wipes out most of the world's population.",
        isbn = "9780385199575"
    )

    val autor2 = Author(
        firstname = "Margaret",
        lastname = "Atwood",
        nationality = "Canadian",
        birthDate = "November 18, 1939",
        bio = "Margaret Atwood is a celebrated author of fiction and poetry, as well as an essayist."
    )

    val editorial2 = Publisher(
        name = "McClelland & Stewart",
        location = "Toronto",
        website = "https://www.penguinrandomhouse.ca/imprints/mcclelland-stewart/",
        foundingYear = 1906
    )

    val libro2 = Book(
        title = "The Testaments",
        authors = listOf(autor2),
        publisher = editorial2,
        publicationYear = "2019",
        pageCount = 419,
        subject = "Dystopian fiction",
        summary = "The Testaments is a dystopian novel by Margaret Atwood and a sequel to The Handmaid's Tale. It is set 15 years after the events of the first novel and explores the downfall of the fictional nation of Gilead.",
        isbn = "9780385543781"
    )


    val autor3 = Author(
        firstname = "Neil",
        lastname = "Gaiman",
        nationality = "British",
        birthDate = "November 10, 1960",
        bio = "Neil Gaiman is an author of novels, comic books, and graphic novels known for his dark fantasy and horror works."
    )

    val editorial3 = Publisher(
        name = "William Morrow",
        location = "New York",
        website = "https://www.harpercollins.com/imprints/william-morrow/",
        foundingYear = 1926
    )

    val libro3 = Book(
        title = "American Gods",
        authors = listOf(autor3),
        publisher = editorial3,
        publicationYear = "2001",
        pageCount = 635,
        subject = "Fantasy, mythology, road novel",
        summary = "American Gods is a novel by Neil Gaiman about an ex-convict named Shadow who becomes embroiled in a conflict between the old gods of mythology and the new gods of technology and media.",
        isbn = "9780060558123"
    )

    val autor4 = Author(
        firstname = "Dan",
        lastname = "Brown",
        nationality = "American",
        birthDate = "June 22, 1964",
        bio = "Dan Brown is an author known for his thriller novels featuring symbologist Robert Langdon."
    )

    val editorial4 =  Publisher(
        name = "Doubleday",
        location = "New York",
        website = "https://www.penguinrandomhouse.com/imprints/doubleday/",
        foundingYear = 1897
    )

    val libro4 = Book(
        title = "The Da Vinci Code",
        authors = listOf(autor4),
        publisher = editorial4,
        publicationYear = "2003",
        pageCount = 454,
        subject = "Thriller, conspiracy fiction",
        summary = "The Da Vinci Code is a thriller novel by Dan Brown that follows symbologist Robert Langdon as he investigates a murder in the Louvre and becomes embroiled in a conspiracy involving the Catholic Church and the Holy Grail.",
        isbn = "9780385504201"
    )


    val autor5 = Author(
        firstname = "Margaret",
        lastname = "Atwood",
        nationality = "Canadian",
        birthDate = "November 18, 1939",
        bio = "Margaret Atwood is an author known for her works of speculative fiction and feminist themes."
    )

    val editorial5 = Publisher(
        name = "McClelland & Stewart",
        location = "Toronto",
        website = "https://www.mcclelland.com/",
        foundingYear = 1906
    )

    val libro5 = Book(
        title = "The Handmaid's Tale",
        authors = listOf(autor5),
        publisher = editorial5,
        publicationYear = "1985",
        pageCount = 311,
        subject = "Dystopian fiction",
        summary = "The Handmaid's Tale is a dystopian novel by Margaret Atwood that follows a woman named Offred as she navigates life in a totalitarian society where women are forced into reproductive servitude.",
        isbn = "9780385490818"
    )

    val autor6 = Author(
        firstname = "Octavia",
        lastname = "Butler",
        nationality = "American",
        birthDate = "June 22, 1947",
        bio = "Octavia Butler was an author known for her works of science fiction and fantasy featuring themes of race, gender, and identity."
    )

    val editorial6 = Publisher(
        name = "Four Walls Eight Windows",
        location = "New York",
        website = "https://www.penguinrandomhouse.com/",
        foundingYear = 1987
    )

    val libro6 = Book(
        title = "Kindred",
        authors = listOf(autor6),
        publisher = editorial6,
        publicationYear = "1979",
        pageCount = 264,
        subject = "Science fiction, historical fiction",
        summary = "Kindred is a novel by Octavia Butler that follows a young African-American woman named Dana who is transported back in time to the antebellum South and must confront the harsh realities of slavery.",
        isbn = "9780807083697"
    )

    val autor7 = Author(
        firstname = "Neil",
        lastname = "Gaiman",
        nationality = "British",
        birthDate = "November 10, 1960",
        bio = "Neil Gaiman is an author known for his works of fantasy, horror, and science fiction."
    )

    val editorial7 = Publisher(
        name = "William Morrow",
        location = "New York",
        website = "https://www.harpercollins.com/",
        foundingYear = 1926
    )

    val libro7 = Book(
        title = "American Gods",
        authors = listOf(autor7),
        publisher = editorial7,
        publicationYear = "2001",
        pageCount = 591,
        subject = "Fantasy, mythological fiction",
        summary = "American Gods is a novel by Neil Gaiman that follows the story of Shadow, a former convict who becomes embroiled in a conflict between the old gods of mythological origin and the new gods of modern technology and media.",
        isbn = "9780380789030"
    )

    //por el momento se dejan publicas para poder acceder a ellas
    public val books = listOf(libro1, libro2, libro3, libro4, libro5, libro6, libro7)
    public val publishers = listOf(editorial1, editorial2, editorial3, editorial4, editorial5, editorial6, editorial7)
    public val authors = listOf(autor1, autor2, autor3, autor4, autor5, autor6, autor7)

