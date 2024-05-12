package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import X.C139555dn;
import X.C161416Vd;
import X.C161426Ve;
import X.C161436Vf;
import X.C161486Vk;
import X.C161576Vt;
import X.C161596Vv;
import X.C161606Vw;
import X.C17N;
import X.C221108m2;
import X.C32151Nz;
import X.C5H3;
import X.InterfaceC146925pg;
import X.InterfaceC147435qV;
import X.InterfaceC153045zY;
import X.InterfaceC1549166d;
import X.OSZ;
import X.WM7;
import Y.ARunnableS0S0202000_2;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS0S0000003_2;
import kotlin.jvm.internal.AqS0S0000101_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditInfoStickerViewModel extends LifecycleAwareViewModel<FTCEditInfoStickerState> implements InterfaceC146925pg {
    public C161426Ve LJLJL;
    public final C5H3 LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 76));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditInfoStickerState kv0() {
        return new FTCEditInfoStickerState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final C161426Ve Kv0() {
        C161426Ve c161426Ve = this.LJLJL;
        if (c161426Ve != null) {
            return c161426Ve;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // X.InterfaceC146925pg
    public void LIZLLL() {
        setState(C161596Vv.LJLIL);
    }

    @Override // X.InterfaceC146925pg
    public void LLZIL() {
        setStateImmediate(C161606Vw.LJLIL);
    }

    public final C161416Vd Lv0() {
        return (C161416Vd) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC146925pg
    public void show() {
        setStateImmediate(C161576Vt.LJLIL);
    }

    @Override // X.InterfaceC146925pg
    public InterfaceC147435qV LIZ() {
        return Kv0().LLJJ();
    }

    @Override // X.InterfaceC146925pg
    public Object V1() {
        return Kv0().LLJJ().LLIIJI;
    }

    @Override // X.InterfaceC146925pg
    public boolean W4() {
        C161436Vf c161436Vf = Kv0().LLJJ().LJLJI;
        if (c161436Vf != null) {
            return c161436Vf.LJZI;
        }
        return false;
    }

    @Override // X.InterfaceC146925pg
    public void k() {
        C161416Vd LLJJ = Kv0().LLJJ();
        if (LLJJ.LLFFF) {
            LLJJ.LJIIJ();
        }
    }

    @Override // X.InterfaceC146925pg
    public boolean p2() {
        C161436Vf c161436Vf = Kv0().LLJJ().LJLJI;
        if (c161436Vf != null) {
            return c161436Vf.LJZ;
        }
        return false;
    }

    @Override // X.InterfaceC146925pg
    public void y2() {
        C161486Vk c161486Vk;
        C161436Vf c161436Vf = Kv0().LLJJ().LJLJI;
        if (c161436Vf == null || (c161486Vk = c161436Vf.LJLJJL) == null || C32151Nz.LJJIIJZLJL(c161486Vk.LIZ)) {
            return;
        }
        Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
        if (!it.hasNext()) {
            c161486Vk.LIZIZ = null;
            return;
        }
        Object next = it.next();
        C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
        next.getClass();
        throw null;
    }

    @Override // X.InterfaceC146925pg
    public void I9(InterfaceC1549166d<?> interfaceC1549166d) {
        Kv0().LLJJ().LJIIIZ(interfaceC1549166d, 0);
    }

    @Override // X.InterfaceC146925pg
    public void K2(InterfaceC1549166d<?> interfaceC1549166d) {
        Kv0().LLJJ().LJII(true, interfaceC1549166d);
    }

    @Override // X.InterfaceC146925pg
    public void LLLLIIIILLL(OSZ<Integer, Integer> value) {
        o.LJIIIZ(value, "value");
        setState(new AqS168S0100000_2(value, (OSZ<Integer, Integer>) 56));
    }

    public final void Mv0(C161426Ve c161426Ve) {
        o.LJIIIZ(c161426Ve, "<set-?>");
        this.LJLJL = c161426Ve;
    }

    public final void gg(StickerItemModel item) {
        o.LJIIIZ(item, "item");
        setState(new AqS168S0100000_2(item, 55));
    }

    @Override // X.InterfaceC146925pg
    public void k1(boolean z) {
        C161486Vk c161486Vk;
        C161436Vf c161436Vf = Kv0().LLJJ().LJLJI;
        if (c161436Vf != null) {
            c161436Vf.LJLJJLL = z;
            if (!z && (c161486Vk = c161436Vf.LJLJJL) != null && c161486Vk.LIZIZ != null) {
                c161486Vk.LIZ();
                c161436Vf.LLD.LJII();
                FTCStickerHintTextViewModel fTCStickerHintTextViewModel = c161436Vf.LJLJJL.LIZLLL;
                if (fTCStickerHintTextViewModel != null) {
                    fTCStickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
                }
                c161436Vf.invalidate();
            }
        }
    }

    @Override // X.InterfaceC146925pg
    public void LLZILL(int i, boolean z) {
        C161436Vf c161436Vf;
        InfoStickerModel infoStickerModel;
        C161416Vd Lv0 = Lv0();
        VideoPublishEditModel videoPublishEditModel = Lv0.LJZI;
        if (videoPublishEditModel != null && (infoStickerModel = videoPublishEditModel.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            for (StickerItemModel stickerItemModel : Lv0.LJZI.infoStickerModel.stickers) {
                OSZ<Integer, Integer> LIZ = C139555dn.LIZ(stickerItemModel.uiStartTime, stickerItemModel.uiEndTime, i);
                stickerItemModel.uiStartTime = LIZ.getFirst().intValue();
                stickerItemModel.uiEndTime = LIZ.getSecond().intValue();
                InterfaceC153045zY interfaceC153045zY = Lv0.LJLZ;
                if (interfaceC153045zY != null) {
                    stickerItemModel.startTime = interfaceC153045zY.LLFZ(LIZ.getFirst().intValue());
                    stickerItemModel.endTime = Lv0.LJLZ.LLFZ(LIZ.getSecond().intValue());
                }
            }
        }
        if (z && (c161436Vf = Lv0().LJLJI) != null) {
            Iterator it = ((ArrayList) c161436Vf.LJLJJL.LIZ).iterator();
            if (!it.hasNext()) {
                return;
            }
            it.next().getClass();
            throw null;
        }
    }

    public final void c50(float f, long j) {
        setState(new AqS0S0000101_2(f, j, 1));
    }

    @Override // X.InterfaceC146925pg
    public void a0(int i, int i2, int[] margins) {
        o.LJIIIZ(margins, "margins");
        C161426Ve Kv0 = Kv0();
        Kv0.getClass();
        C161416Vd LLJJ = Kv0.LLJJ();
        if (LLJJ.LJLZ == null) {
            return;
        }
        LLJJ.LLI.post(new ARunnableS0S0202000_2(LLJJ, i, i2, margins, 4));
    }

    public final void j30(float f, float f2, float f3) {
        setState(new AqS0S0000003_2(f, f2, f3, 1));
    }
}
