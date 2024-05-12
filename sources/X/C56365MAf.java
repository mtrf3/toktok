package X;

import com.bytedance.keva.Keva;

/* renamed from: X.MAf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56365MAf extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C56365MAf LJLIL = new C56365MAf();

    public C56365MAf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("story_widget_manager_repo");
    }
}
