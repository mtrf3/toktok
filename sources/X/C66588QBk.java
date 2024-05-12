package X;

/* renamed from: X.QBk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66588QBk implements InterfaceC65644PpY<String, String> {
    @Override // X.InterfaceC65644PpY
    public final String apply(String str) {
        return str.replaceFirst("/data/user/0/", "/data/data/");
    }
}
