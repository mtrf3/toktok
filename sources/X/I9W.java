package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes8.dex */
public interface I9W extends InterfaceC82400WVo, C0I6 {
    LiveEvent<T4S> CY();

    /* synthetic */ void D8(InterfaceC88472Yns<? super F4V, Boolean> interfaceC88472Yns);

    LiveEvent<Boolean> Dj();

    void H20();

    LiveEvent<Boolean> He0();

    void J20(Effect effect);

    LiveEvent<Effect> KL();

    @Override // X.InterfaceC82400WVo
    /* synthetic */ IDH LLLF();

    @Override // X.InterfaceC63084OpM
    /* synthetic */ F4V LLLIIII(InterfaceC88472Yns<? super F4V, Boolean> interfaceC88472Yns);

    @Override // X.InterfaceC82400WVo
    /* synthetic */ TEZ LLLLL();

    @Override // X.InterfaceC82400WVo
    /* synthetic */ SafeHandler LLLZI();

    @Override // X.InterfaceC82400WVo
    /* synthetic */ InterfaceC46204IBk LLZL();

    void No(InterfaceC83566Wqw interfaceC83566Wqw, FrameLayout frameLayout);

    /* synthetic */ void P2(F4V f4v);

    void PU();

    InterfaceC46134I8s SH();

    LiveEvent<Boolean> Tk();

    /* synthetic */ void U9(IDH idh);

    void Uf0(boolean z);

    LiveEvent<Boolean> V40();

    void W90(boolean z, String str);

    void Yq();

    FaceStickerBean Z5();

    /* synthetic */ void Z7();

    LiveEvent<HY8> aZ();

    void bi0();

    T4O ch0();

    void g00(List<? extends Effect> list, boolean z);

    /* synthetic */ void g1(F4V f4v);

    boolean g20(T4Q t4q);

    void g30();

    /* synthetic */ LifecycleOwner getLifecycleOwner();

    void rJ(boolean z);

    LiveEvent<Boolean> sF();

    /* synthetic */ void u5(int i, int i2, int i3, String str);

    AbstractC73672Svk<OSZ<Effect, C44243HXz>> ua0();

    void uc0(boolean z);

    void uq0(boolean z);

    LiveEvent<C76800UCe> xU();

    LiveEvent<Boolean> yn();
}
