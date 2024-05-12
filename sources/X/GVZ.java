package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class GVZ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final GVZ LJLIL = new GVZ();

    public GVZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_author_survey");
    }
}
