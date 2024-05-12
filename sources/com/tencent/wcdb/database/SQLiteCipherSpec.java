package com.tencent.wcdb.database;

/* loaded from: classes16.dex */
public class SQLiteCipherSpec {
    public String cipher;
    public boolean hmacEnabled;
    public int kdfIteration;
    public int pageSize;

    public SQLiteCipherSpec() {
        this.hmacEnabled = true;
        this.pageSize = SQLiteGlobal.LIZ;
    }

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
        this.hmacEnabled = true;
        this.pageSize = SQLiteGlobal.LIZ;
        this.cipher = sQLiteCipherSpec.cipher;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }
}
