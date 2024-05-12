package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class MA2 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final MA2 LJLIL = new MA2();

    public MA2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_story_widget");
    }
}
