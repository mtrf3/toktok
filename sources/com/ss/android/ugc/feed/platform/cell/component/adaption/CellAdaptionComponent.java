package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.AbstractC48820JEa;
import X.C10K;
import X.C221138m5;
import X.C223048pA;
import X.C224198r1;
import X.C224218r3;
import X.C224228r4;
import X.C224238r5;
import X.C2K0;
import X.C32151Nz;
import X.C32I;
import X.C47261Igj;
import X.C51029K0z;
import X.C55096Ljo;
import X.C61447O9r;
import X.C63081OpJ;
import X.C7MY;
import X.EF7;
import X.InterfaceC222708oc;
import X.InterfaceC55102Lju;
import X.KR8;
import X.O6R;
import X.X1D;
import Y.ACallableS106S0100000_3;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CellAdaptionComponent extends BaseCellContentComponent implements CellAdaptionComponentAbility, InterfaceC55102Lju {
    public static final C224198r1 LLIIIL = new C224198r1();
    public static final int LLIIIZ = C7MY.LIZIZ(12);
    public static final int LLIIJI = C7MY.LIZIZ(16);
    public static final int LLIIJLIL = C7MY.LIZIZ(8);
    public static final int LLIIL = C7MY.LIZIZ(44);
    public static final int LLIILII = C7MY.LIZIZ(40);
    public static final int LLIILZL = C7MY.LIZIZ(378);
    public static final int LLIIZ = C7MY.LIZIZ(78);
    public static final int LLIL = C7MY.LIZIZ(132);
    public C224238r5 LL;
    public C224218r3 LLD;
    public volatile List<? extends OcrLocation> LLF;
    public volatile Rect LLFF;
    public volatile Rect LLFFF;
    public volatile Rect LLFII;
    public volatile Rect LLFZ;
    public volatile Rect LLI;
    public volatile Rect LLIFFJFJJ;
    public volatile Rect LLII;
    public final C221138m5 LLIIII;
    public final C221138m5 LLIIIILZ;
    public final C221138m5 LLIIIJ;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void unBind() {
        InterfaceC222708oc LLLJ;
        View view = null;
        this.LLD = null;
        this.LL = null;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLIIIJ.getValue();
        if (iVideoCellAbility != null && (LLLJ = iVideoCellAbility.LLLJ()) != null) {
            view = LLLJ.getVideoView();
        }
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        getContainerView().findViewById(R.id.eq0).setTranslationY(0.0f);
        getContainerView().findViewById(R.id.cover).setTranslationY(0.0f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean vH() {
        return e4(this, false, true, false, 5);
    }

    public CellAdaptionComponent() {
        new LinkedHashMap();
        this.LLFF = new Rect();
        this.LLFFF = new Rect();
        this.LLFII = new Rect();
        this.LLFZ = new Rect();
        this.LLI = new Rect();
        this.LLIFFJFJJ = new Rect();
        this.LLII = new Rect();
        this.LLIIII = KR8.LJIIJJI(new AqS153S0100000_3(this, 1237));
        this.LLIIIILZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 1238));
        this.LLIIIJ = KR8.LJIIJJI(new AqS153S0100000_3(this, 1239));
    }

    @Override // X.C8W0
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        C55096Ljo.LIZJ(this);
    }

    public static boolean l4(Rect rect) {
        if (rect.width() == 0 || rect.height() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        InterfaceC222708oc LLLJ;
        View videoView;
        InterfaceC222708oc LLLJ2;
        View videoView2;
        o.LJIIIZ(item, "item");
        C224198r1 c224198r1 = LLIIIL;
        C224218r3 c224218r3 = new C224218r3(c224198r1);
        this.LLD = c224218r3;
        this.LL = new C224238r5(c224218r3);
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo() == null) {
            return;
        }
        if (!k4(true)) {
            c224198r1.LJ("CellAdaptionComponent", "[onBind] calStickerLocs cache invalid");
            C10K.LIZJ(new ACallableS106S0100000_3(this, 15));
        }
        float f = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().newTranslateY;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLIIIJ.getValue();
        if (iVideoCellAbility != null && (LLLJ2 = iVideoCellAbility.LLLJ()) != null && (videoView2 = LLLJ2.getVideoView()) != null) {
            videoView2.setTranslationY(f);
        }
        getContainerView().findViewById(R.id.eq0).setTranslationY(f);
        getContainerView().findViewById(R.id.cover).setTranslationY(f);
        float f2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().newTranslateY;
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLIIIJ.getValue();
        if (iVideoCellAbility2 == null || (LLLJ = iVideoCellAbility2.LLLJ()) == null || (videoView = LLLJ.getVideoView()) == null) {
            return;
        }
        videoView.setTranslationY(f2);
    }

    public final void b4(Aweme aweme) {
        List<? extends OcrLocation> list;
        C224218r3 c224218r3;
        String str;
        String str2;
        String str3;
        if (aweme == null || (list = this.LLF) == null || list.isEmpty() || (c224218r3 = this.LLD) == null) {
            return;
        }
        aweme.newTranslateY = (int) (c224218r3.LJIIJJI * c224218r3.LIZJ);
        String str4 = "1";
        if (c224218r3.LJIILIIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        aweme.isIntextOccludeTab = str;
        if (c224218r3.LJIILJJIL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        aweme.isIntextOccludeInteraction = str2;
        if (c224218r3.LJIIL) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        aweme.isIntextOut = str3;
        if (!c224218r3.LJIILL) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        aweme.isIntextOccludeDesc = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k4(boolean r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent.k4(boolean):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean yO(boolean z) {
        return e4(this, true, false, z, 2);
    }

    public final void c4(Context context, ViewGroup viewGroup) {
        int i;
        int i2;
        List<? extends OcrLocation> list;
        List<? extends OcrLocation> list2;
        C224218r3 c224218r3;
        if (this.LL != null) {
            i = C224238r5.LIZLLL(context, viewGroup);
        } else {
            i = 0;
        }
        if (this.LL != null) {
            i2 = C224238r5.LJ(context, viewGroup);
        } else {
            i2 = 0;
        }
        C224218r3 c224218r32 = this.LLD;
        if (c224218r32 != null) {
            c224218r32.LIZJ = i;
            c224218r32.LIZLLL = i2;
        }
        if (this.LLF != null && (((list = this.LLF) == null || !list.isEmpty()) && (list2 = this.LLF) != null && (c224218r3 = this.LLD) != null && c224218r3.LJI == null)) {
            c224218r3.LJIIIZ = false;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            for (OcrLocation ocrLocation : list2) {
                AbstractC48820JEa abstractC48820JEa = c224218r3.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[setLocations] xMin");
                LIZ.append(ocrLocation.xMin);
                LIZ.append(" xMax");
                LIZ.append(ocrLocation.xMax);
                LIZ.append(" yMin");
                LIZ.append(ocrLocation.yMin);
                LIZ.append(" yMax");
                LIZ.append(ocrLocation.yMax);
                abstractC48820JEa.LIZLLL(X1D.LIZIZ(LIZ));
                arrayList.add(new C224228r4(c224218r3, ocrLocation));
            }
            c224218r3.LJI = arrayList;
        }
        g4(i2, i);
        C224218r3 c224218r33 = this.LLD;
        if (c224218r33 != null) {
            c224218r33.LJFF(C47261Igj.LJJIJIIJI(this.LLFZ, this.LLI, this.LLIFFJFJJ, this.LLII));
        }
    }

    public final void g4(int i, int i2) {
        int i3;
        int i4;
        Rect rect;
        Rect rect2;
        Rect rect3;
        if (i <= 0 || i2 <= 0) {
            LLIIIL.LJ("CellAdaptionComponent", "[calOcclusions] invalid containerView height width ");
            return;
        }
        int i5 = C61447O9r.LJIILIIL;
        int i6 = C61447O9r.LJIILJJIL;
        if (i5 <= 0) {
            i3 = C63081OpJ.LJJJJLI(EF7.LIZIZ());
        } else {
            i3 = 0;
        }
        if (i6 <= 0) {
            i4 = C7MY.LIZIZ(C61447O9r.LJIIJJI);
        } else {
            i4 = 0;
        }
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) this.LLIIIILZ.getValue();
        if (interactRightAreaAttachAbility == null || (rect = interactRightAreaAttachAbility.K1()) == null) {
            rect = new Rect();
        }
        this.LLFF = rect;
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) this.LLIIII.getValue();
        if (interactInfoAreaAttachAbility == null || (rect2 = interactInfoAreaAttachAbility.K1()) == null) {
            rect2 = new Rect();
        }
        this.LLFFF = rect2;
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility2 = (InteractInfoAreaAttachAbility) this.LLIIII.getValue();
        if (interactInfoAreaAttachAbility2 == null || (rect3 = interactInfoAreaAttachAbility2.dJ()) == null) {
            rect3 = new Rect();
        }
        this.LLFII = rect3;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(58.0d))) + i3;
        int i7 = LLIIIZ;
        this.LLFZ = new Rect(0, 0, i2, LJJIIZ - i7);
        if (l4(this.LLFF)) {
            this.LLI = new Rect(i2 - LLIILII, i - (LLIILZL + i4), i2, i);
        } else {
            float f = this.LLFF.left;
            int width = this.LLFF.width();
            int i8 = LLIIL;
            float f2 = i7;
            this.LLI = new Rect((int) (((width - i8) / 2.0f) + f + f2), (int) (((this.LLFF.width() - i8) / 2.0f) + this.LLFF.top + LLIIJLIL + f2), i2, i);
        }
        if (l4(this.LLFFF) || l4(this.LLFII)) {
            this.LLII = new Rect(0, i - (i4 + LLIIZ), i2 - LLIL, i);
            this.LLIFFJFJJ = new Rect();
        } else {
            int i9 = this.LLFFF.top;
            int i10 = LLIIJI;
            this.LLIFFJFJJ = new Rect(0, i9 + i10, this.LLFII.right / 2, i);
            this.LLII = new Rect(0, this.LLFII.top + i10, this.LLFII.right - (i10 * 2), i);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final C223048pA I60(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup) {
        boolean z;
        C224218r3 c224218r3;
        Boolean valueOf;
        o.LJIIIZ(context, "context");
        C223048pA c223048pA = null;
        if (aweme != null && (c224218r3 = this.LLD) != null && (valueOf = Boolean.valueOf(c224218r3.LIZ(aweme))) != null) {
            z = valueOf.booleanValue();
            if (z) {
                c4(context, viewGroup);
            }
        } else {
            z = false;
        }
        C224238r5 c224238r5 = this.LL;
        if (c224238r5 != null) {
            c223048pA = c224238r5.LIZIZ(context, aweme, viewGroup);
        }
        if (z) {
            b4(aweme);
        }
        if (c223048pA == null) {
            return new C223048pA(0, 0);
        }
        return c223048pA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r5 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e4(com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent r10, boolean r11, boolean r12, boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent.e4(com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent, boolean, boolean, boolean, int):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void CA(Context context, Aweme aweme, View videoView, OcrLocation ocrLocation, ViewGroup containerView) {
        boolean z;
        C224218r3 c224218r3;
        Boolean valueOf;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(videoView, "videoView");
        o.LJIIIZ(containerView, "containerView");
        if (aweme != null && (c224218r3 = this.LLD) != null && (valueOf = Boolean.valueOf(c224218r3.LIZ(aweme))) != null) {
            z = valueOf.booleanValue();
            if (z) {
                c4(context, containerView);
            }
        } else {
            z = false;
        }
        C224238r5 c224238r5 = this.LL;
        if (c224238r5 != null) {
            c224238r5.LJIIL(context, aweme, videoView, containerView);
        }
        if (z) {
            b4(aweme);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void JK(Context context, Aweme aweme, View view, SmartImageView smartImageView, OcrLocation ocrLocation, ViewGroup viewGroup) {
        boolean z;
        C224218r3 c224218r3;
        Boolean valueOf;
        if (aweme != null && (c224218r3 = this.LLD) != null && (valueOf = Boolean.valueOf(c224218r3.LIZ(aweme))) != null) {
            z = valueOf.booleanValue();
            if (z) {
                c4(context, viewGroup);
            }
        } else {
            z = false;
        }
        C224238r5 c224238r5 = this.LL;
        if (c224238r5 != null) {
            c224238r5.LIZ(context, aweme, view, smartImageView, viewGroup);
        }
        if (z) {
            b4(aweme);
        }
    }
}
