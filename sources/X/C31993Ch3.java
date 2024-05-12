package X;

import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* renamed from: X.Ch3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31993Ch3 implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.LJLIL) {
            case 0:
                StickerMessageManager.LIZIZ((StickerMessageManager) this.LJLJI, this.LJLILLLLZI, (C28467BFf) obj);
                return;
            default:
                SettingNewVersionFragment.sn((SettingNewVersionFragment) this.LJLJI, this.LJLILLLLZI, (C68922R3e) obj);
                return;
        }
    }

    public /* synthetic */ C31993Ch3(int i, String str, Object obj) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = str;
    }
}
