package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DPZ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DPZ LJLIL = new DPZ();

    public DPZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_startwatching_anim_video_prerender(), "new_user_startwatching_anim_video_prerender");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
