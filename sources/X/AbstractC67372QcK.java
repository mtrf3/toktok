package X;

/* renamed from: X.QcK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67372QcK {
    public final void LIZ(String str, String str2) {
        java.util.Map<String, String> map = ((C67362QcA) this).LJFF;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
}
