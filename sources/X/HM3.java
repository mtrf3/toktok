package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HM3 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HM3 LJLIL = new HM3();

    public HM3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("story_publish_video_model_cache");
    }
}
