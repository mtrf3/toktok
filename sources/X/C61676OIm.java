package X;

/* renamed from: X.OIm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61676OIm extends AbstractC61884OQm<String> {
    public final /* synthetic */ C61675OIl LJLILLLLZI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLILLLLZI.LIZ.groupCount() + 1;
    }

    public C61676OIm(C61675OIl c61675OIl) {
        this.LJLILLLLZI = c61675OIl;
    }

    @Override // X.OQZ, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final Object get(int i) {
        String group = this.LJLILLLLZI.LIZ.group(i);
        if (group == null) {
            return "";
        }
        return group;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }
}
