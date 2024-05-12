package X;

import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.1dE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37281dE extends AbstractC24260xK {
    public final DataChannel LIZLLL;
    public final LiveSmallItemBeautyViewModel LJ;
    public final String LJFF;
    public final C44151oJ LJI;
    public final java.util.Set<String> LJII;
    public XKQ LJIIIIZZ;

    @Override // X.AbstractC24260xK
    public final void LIZ() {
        C88207Yjb.LIZJ(this.LIZIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37281dE(ViewGroup parent, DataChannel dataChannel, LiveSmallItemBeautyViewModel beautyViewModel, String effectPanelName) {
        super(parent);
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(beautyViewModel, "beautyViewModel");
        o.LJIIIZ(effectPanelName, "effectPanelName");
        this.LIZLLL = dataChannel;
        this.LJ = beautyViewModel;
        this.LJFF = effectPanelName;
        String SMALL_ITEM_BEAUTY_PANEL = C0TY.LIZLLL;
        o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL, "SMALL_ITEM_BEAUTY_PANEL");
        C44151oJ c44151oJ = new C44151oJ();
        this.LJI = c44151oJ;
        this.LJII = new LinkedHashSet();
        c44151oJ.LJLJL = SMALL_ITEM_BEAUTY_PANEL;
        c44151oJ.LJLJJI = new InterfaceC261110t() { // from class: X.1dD
            @Override // X.InterfaceC261110t
            public final void LIZ(LiveEffect liveEffect, int i) {
                o.LJIIIZ(liveEffect, "liveEffect");
                InterfaceC30442Bx8.LJJIIJZLJL.LIZ(Boolean.valueOf(C78880UxY.LJJL(liveEffect)));
                C0TX.LIZ.LIZJ("LiveSmallItemBeautyFragment");
                C0TX.LIZLLL = "onChange";
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("index: ");
                LIZ.append(i);
                LIZ.append(' ');
                LIZ.append(liveEffect);
                C0TX.LIZIZ(X1D.LIZIZ(LIZ));
                DataChannel dataChannel2 = C37281dE.this.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        this.LIZIZ.setAdapter(c44151oJ);
        this.LIZIZ.setLayoutManager(this.LIZJ);
        this.LIZIZ.setItemAnimator(null);
        this.LIZIZ.setHasFixedSize(true);
        C88207Yjb.LIZJ(this.LIZIZ);
        this.LJIIIIZZ = XKX.LIZLLL(ViewModelKt.getViewModelScope(beautyViewModel), null, null, new C55662Gk(this, null), 3);
    }
}
