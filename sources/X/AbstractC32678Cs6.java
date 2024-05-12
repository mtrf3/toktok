package X;

import Y.ACListenerS24S0101000_5;
import Y.ALAdapterS4S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDCListenerS298S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.Cs6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32678Cs6 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public View LJLILLLLZI;
    public ImageView LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public C47061t0 LJLJJLL;
    public C47061t0 LJLJL;
    public C47061t0 LJLJLJ;
    public C47121t6 LJLJLLL;
    public ImageView LJLL;
    public ImageView LJLLI;
    public View LJLLILLLL;
    public C77557UcD LJLLJ;
    public C47121t6 LJLLL;
    public C47121t6 LJLLLL;
    public C47121t6 LJLLLLLL;
    public LiveIconView LJLZ;
    public AbstractC32698CsQ<? extends C30896CAq> LJZ;
    public InterfaceC32725Csr LJZI;
    public boolean LJZL;
    public boolean LL;
    public long LLD;
    public ImageModel LLF;
    public boolean LLFF;
    public final C73318Sq2 LLFFF;

    public abstract String Q();

    public void T() {
    }

    public void M() {
        this.LJLIL.setOnTouchListener(new IDTListenerS115S0100000_5(this, 12));
    }

    public final void P() {
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        if (((Boolean) C31160CKu.LIZLLL.getValue()).booleanValue()) {
            if (X()) {
                return;
            }
        } else if (X() || (abstractC32698CsQ = this.LJZ) == null || !abstractC32698CsQ.LIZJ) {
            return;
        }
        AnimatorSet LIZIZ = C32729Csv.LIZIZ(this.LJLIL);
        LIZIZ.addListener(new ALAdapterS4S0100000_5(this, 41));
        LIZIZ.start();
    }

    public void U() {
        long j;
        Long l;
        Object obj;
        List arrayList;
        Gift gift;
        InterfaceC32725Csr interfaceC32725Csr;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJZ;
        boolean z = true;
        if (abstractC32698CsQ != null && (interfaceC32725Csr = this.LJZI) != null) {
            interfaceC32725Csr.LJJJJLI(getBindingAdapterPosition(), abstractC32698CsQ.LIZJ(), true);
        }
        C32683CsB c32683CsB = C32783Ctn.LIZ;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJZ;
        if (abstractC32698CsQ2 != null) {
            j = abstractC32698CsQ2.LIZJ();
        } else {
            j = 0;
        }
        c32683CsB.LJ.put(j, 1);
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LJZ;
        if (abstractC32698CsQ3 == null || abstractC32698CsQ3.LIZJ) {
            z = false;
        }
        ImageModel imageModel = null;
        if (z) {
            if (abstractC32698CsQ3 != null) {
                l = Long.valueOf(abstractC32698CsQ3.LIZJ());
            } else {
                l = null;
            }
            this.LLD = C32272ClY.LIZ(l);
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = this.LJZ;
            if (abstractC32698CsQ4 != null) {
                obj = abstractC32698CsQ4.LIZIZ;
            } else {
                obj = null;
            }
            if (!(obj instanceof Gift) || (gift = (Gift) obj) == null || (arrayList = gift.colorInfos) == null) {
                arrayList = new ArrayList();
            }
            this.LLF = null;
            Iterator it = ((ArrayList) arrayList).iterator();
            while (it.hasNext()) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) it.next();
                Long l2 = giftColorInfo.colorId;
                long j2 = this.LLD;
                if (l2 != null && l2.longValue() == j2) {
                    this.LLF = giftColorInfo.giftImage;
                }
            }
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 = this.LJZ;
            if (abstractC32698CsQ5 != null) {
                abstractC32698CsQ5.LJFF = this.LLF;
            }
        }
        int LIZJ = C30760C5k.LIZJ();
        C47061t0 c47061t0 = this.LJLJJLL;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ6 = this.LJZ;
        if (abstractC32698CsQ6 != null && (imageModel = abstractC32698CsQ6.LJFF) == null) {
            imageModel = abstractC32698CsQ6.LIZLLL();
        }
        C30760C5k.LIZIZ(c47061t0, imageModel, R.drawable.d1o, new C32693CsL(this), LIZJ, LIZJ);
    }

    public void c0() {
        String str;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        C29306Beo.LJJLJLI(this.LJLILLLLZI);
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJZ;
            if (abstractC32698CsQ2 != null) {
                str = abstractC32698CsQ2.LJFF();
            } else {
                str = null;
            }
            c47121t6.setText(str);
        }
        C47121t6 c47121t62 = this.LJLJJI;
        if (c47121t62 != null) {
            c47121t62.setVisibility(0);
        }
        C47061t0 c47061t0 = this.LJLJJLL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        C47121t6 c47121t63 = this.LJLLLL;
        if (c47121t63 != null) {
            c47121t63.setVisibility(0);
        }
        g0(4);
        C47061t0 c47061t02 = this.LJLJLJ;
        if (c47061t02 != null) {
            c47061t02.setVisibility(8);
        }
        C47121t6 c47121t64 = this.LJLJLLL;
        if (c47121t64 != null) {
            c47121t64.setTextColor(C15380j0.LIZIZ(R.color.be));
        }
        C47121t6 c47121t65 = this.LJLJJL;
        if (c47121t65 != null) {
            c47121t65.setTextColor(C15380j0.LIZIZ(R.color.be));
        }
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            InterfaceC32725Csr interfaceC32725Csr = this.LJZI;
            if (interfaceC32725Csr != null) {
                interfaceC32725Csr.LIZJ(false);
            }
        } else {
            C77557UcD c77557UcD = this.LJLLJ;
            if (c77557UcD != null) {
                c77557UcD.setVisibility(8);
            }
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LJZ;
        if ((abstractC32698CsQ3 != null && abstractC32698CsQ3.LJIIIZ()) || ((abstractC32698CsQ = this.LJZ) != null && abstractC32698CsQ.LJII())) {
            LiveIconView liveIconView = this.LJLZ;
            if (liveIconView != null) {
                liveIconView.setVisibility(0);
            }
        } else {
            LiveIconView liveIconView2 = this.LJLZ;
            if (liveIconView2 != null) {
                liveIconView2.setVisibility(8);
            }
        }
        this.LJZL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0() {
        /*
            r9 = this;
            X.CsQ<? extends X.CAq> r3 = r9.LJZ
            r0 = 0
            if (r3 == 0) goto La
            com.bytedance.android.live.base.model.ImageModel r1 = r3.LJ
            if (r1 == 0) goto Lc
            return
        La:
            r2 = r0
            goto L10
        Lc:
            if (r3 == 0) goto La
            T extends X.CAq r2 = r3.LIZIZ
        L10:
            boolean r1 = r2 instanceof com.bytedance.android.livesdk.model.Gift
            if (r1 == 0) goto L55
            com.bytedance.android.livesdk.model.Gift r2 = (com.bytedance.android.livesdk.model.Gift) r2
            if (r2 == 0) goto L56
            com.bytedance.android.live.base.model.ImageModel r6 = r2.previewImage
        L1a:
            if (r3 == 0) goto L3f
            boolean r1 = r3.LJI()
            r8 = 1
            if (r1 != r8) goto L3f
            if (r6 == 0) goto L3b
            if (r2 == 0) goto L3c
            long r0 = r2.id
        L29:
            int r2 = X.C30760C5k.LIZJ()
            X.1t0 r5 = r9.LJLJLJ
            r4 = 2131235448(0x7f081278, float:1.808709E38)
            X.Csi r7 = new X.Csi
            r7.<init>(r0, r9)
            r3 = r2
            X.C30760C5k.LIZLLL(r2, r3, r4, r5, r6, r7, r8)
        L3b:
            return
        L3c:
            r0 = 0
            goto L29
        L3f:
            if (r2 == 0) goto L43
            com.bytedance.android.live.base.model.ImageModel r0 = r2.image
        L43:
            X.CsQ<? extends X.CAq> r2 = r9.LJZ
            if (r2 == 0) goto L4f
            com.bytedance.android.live.base.model.ImageModel r1 = r2.LJFF
            if (r1 == 0) goto L4f
            if (r2 == 0) goto L3b
            com.bytedance.android.live.base.model.ImageModel r0 = r2.LJFF
        L4f:
            if (r0 == 0) goto L3b
            r9.a0(r0)
            goto L3b
        L55:
            r2 = r0
        L56:
            r6 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32678Cs6.i0():void");
    }

    public final boolean X() {
        Long l;
        GiftManager inst = GiftManager.inst();
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJZ;
        if (abstractC32698CsQ != null) {
            l = Long.valueOf(abstractC32698CsQ.LIZJ());
        } else {
            l = null;
        }
        if (inst.getFreqLimitOption(l) != null) {
            return true;
        }
        return false;
    }

    public void f0() {
        boolean z;
        boolean z2;
        String str;
        String str2;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        C29800Bmm gr;
        if (C31160CKu.LIZLLL()) {
            i0();
        }
        C47061t0 c47061t0 = this.LJLJLJ;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJZ;
        if (abstractC32698CsQ2 != null && abstractC32698CsQ2.LJI()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C47061t0 c47061t02 = this.LJLJJLL;
            if (c47061t02 != null) {
                c47061t02.setVisibility(0);
            }
        } else {
            C47061t0 c47061t03 = this.LJLJJLL;
            if (c47061t03 != null) {
                c47061t03.setVisibility(8);
            }
        }
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        g0(0);
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setVisibility(8);
        }
        C47121t6 c47121t62 = this.LJLJLLL;
        if (c47121t62 != null) {
            c47121t62.setTextColor(C15380j0.LIZIZ(R.color.bc));
        }
        C47121t6 c47121t63 = this.LJLJJL;
        if (c47121t63 != null) {
            c47121t63.setTextColor(C15380j0.LIZIZ(R.color.bc));
        }
        LiveIconView liveIconView = this.LJLZ;
        if (liveIconView != null) {
            liveIconView.setVisibility(8);
        }
        InterfaceC32725Csr interfaceC32725Csr = this.LJZI;
        if (interfaceC32725Csr != null && interfaceC32725Csr.LJFF()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C47121t6 c47121t64 = this.LJLLLLLL;
            if (c47121t64 != null) {
                c47121t64.setVisibility(Y(0));
            }
            C47121t6 c47121t65 = this.LJLLLL;
            if (c47121t65 != null) {
                c47121t65.setVisibility(4);
            }
            C47121t6 c47121t66 = this.LJLLL;
            if (c47121t66 == null) {
                return;
            }
            c47121t66.setVisibility(4);
            return;
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LJZ;
        if (abstractC32698CsQ3 != null && (str2 = abstractC32698CsQ3.LJII) != null && str2.equals("")) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = this.LJZ;
            if ((abstractC32698CsQ4 != null && abstractC32698CsQ4.LJIIIIZZ()) || ((abstractC32698CsQ = this.LJZ) != null && abstractC32698CsQ.LJIIJJI() && (gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr()) != null && gr.LJFF == 2)) {
                C47121t6 c47121t67 = this.LJLLLLLL;
                if (c47121t67 != null) {
                    c47121t67.setVisibility(Y(0));
                }
                C47121t6 c47121t68 = this.LJLLLL;
                if (c47121t68 != null) {
                    c47121t68.setVisibility(4);
                }
                C47121t6 c47121t69 = this.LJLLL;
                if (c47121t69 == null) {
                    return;
                }
                c47121t69.setVisibility(4);
                return;
            }
            C47121t6 c47121t610 = this.LJLLLL;
            if (c47121t610 != null) {
                c47121t610.setVisibility(0);
            }
            C47121t6 c47121t611 = this.LJLLLLLL;
            if (c47121t611 != null) {
                c47121t611.setVisibility(Y(4));
            }
            C47121t6 c47121t612 = this.LJLLL;
            if (c47121t612 == null) {
                return;
            }
            c47121t612.setVisibility(4);
            return;
        }
        C47121t6 c47121t613 = this.LJLLL;
        if (c47121t613 != null) {
            c47121t613.setVisibility(0);
        }
        C47121t6 c47121t614 = this.LJLLLL;
        if (c47121t614 != null) {
            c47121t614.setVisibility(4);
        }
        C47121t6 c47121t615 = this.LJLLLLLL;
        if (c47121t615 != null) {
            c47121t615.setVisibility(Y(4));
        }
        C47121t6 c47121t616 = this.LJLLL;
        if (c47121t616 == null) {
            return;
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 = this.LJZ;
        if (abstractC32698CsQ5 != null) {
            str = abstractC32698CsQ5.LJII;
        } else {
            str = null;
        }
        c47121t616.setText(str);
    }

    public AbstractC32678Cs6(View view) {
        super(view);
        this.LJLIL = view;
        this.LLD = -1L;
        new ArrayList();
        this.LLFFF = new C73318Sq2();
        this.LJLJLJ = (C47061t0) view.findViewById(R.id.dsp);
        this.LJLJI = (ImageView) view.findViewById(R.id.fp0);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.gzi);
        if (C31160CKu.LIZ()) {
            C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.gzg);
            this.LJLJJL = c47121t6;
            if (c47121t6 != null) {
                c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            }
        }
        this.LJLJJLL = (C47061t0) view.findViewById(R.id.gzh);
        this.LJLJL = (C47061t0) view.findViewById(R.id.cs6);
        this.LJLLILLLL = view.findViewById(R.id.lpz);
        this.LJLLL = (C47121t6) view.findViewById(R.id.etp);
        this.LJLLLL = (C47121t6) view.findViewById(R.id.euy);
        this.LJLLLLLL = (C47121t6) view.findViewById(R.id.euz);
        this.LJLZ = (LiveIconView) view.findViewById(R.id.kqh);
        this.LJLL = (ImageView) view.findViewById(R.id.bgf);
        this.LJLJLLL = (C47121t6) this.itemView.findViewById(R.id.gzf);
        C47121t6 c47121t62 = this.LJLLLL;
        if (c47121t62 != null) {
            c47121t62.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        C47121t6 c47121t63 = this.LJLJJI;
        if (c47121t63 != null) {
            c47121t63.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        C47121t6 c47121t64 = this.LJLJLLL;
        if (c47121t64 != null) {
            c47121t64.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        this.LJLILLLLZI = view.findViewById(R.id.btg);
    }

    public void L(int i) {
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(i, this, 4), this.LJLIL);
        this.LJLIL.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 4));
    }

    public final void V(DataChannel dataChannel) {
        String str;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        ViewGroup.LayoutParams layoutParams;
        String str2;
        ImageModel LJ;
        ImageModel imageModel;
        ImageView imageView;
        ImageModel LJ2;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJZ;
        ImageModel imageModel2 = null;
        if (abstractC32698CsQ2 != null && (LJ2 = abstractC32698CsQ2.LJ()) != null) {
            str = LJ2.getUri();
        } else {
            str = null;
        }
        if (C32502CpG.LIZLLL(abstractC32698CsQ2, dataChannel, TextUtils.isEmpty(str))) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LJZ;
            if (abstractC32698CsQ3 != null && !abstractC32698CsQ3.LIZJ && (imageView = this.LJLJI) != null) {
                C29306Beo.LJJLJLI(imageView);
            }
            C32476Coq c32476Coq = C32502CpG.LIZIZ().LIZIZ;
            if (c32476Coq != null && (imageModel = c32476Coq.LIZ) != null) {
                C30760C5k.LJ(this.LJLJI, imageModel, 0, 0, 0, new IDdS56S0100000_5(this, 8), 60);
                return;
            }
            return;
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = this.LJZ;
        if (abstractC32698CsQ4 != null && abstractC32698CsQ4.LJ() != null) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 = this.LJZ;
            if (abstractC32698CsQ5 != null && (LJ = abstractC32698CsQ5.LJ()) != null) {
                str2 = LJ.getUri();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                ImageView imageView2 = this.LJLJI;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ImageView imageView3 = this.LJLJI;
                if (imageView3 == null) {
                    return;
                }
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ6 = this.LJZ;
                if (abstractC32698CsQ6 != null) {
                    imageModel2 = abstractC32698CsQ6.LJ();
                }
                C30760C5k.LJ(imageView3, imageModel2, -1, -1, 0, new IDdS56S0100000_5(this, 7), 48);
                return;
            }
        }
        if (C31120CJg.LJIIIZ() && (abstractC32698CsQ = this.LJZ) != null && C31120CJg.LJIIJJI() == abstractC32698CsQ.LIZJ()) {
            ImageView imageView4 = this.LJLJI;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.LJLJI;
            if (imageView5 != null && (layoutParams = imageView5.getLayoutParams()) != null) {
                layoutParams.width = C15380j0.LIZ(15.0f);
            }
            ImageView imageView6 = this.LJLJI;
            if (imageView6 != null) {
                C15490jB.LJ(imageView6, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_revenue_demand_1"), "ttlive_gift_only_model_match_tag.png");
            }
            if (C31120CJg.LIZ.Zf()) {
                ImageView imageView7 = this.LJLJI;
                if (imageView7 == null) {
                    return;
                }
                imageView7.setVisibility(0);
                return;
            }
            ImageView imageView8 = this.LJLJI;
            if (imageView8 == null) {
                return;
            }
            imageView8.setVisibility(8);
            return;
        }
        ImageView imageView9 = this.LJLJI;
        if (imageView9 == null) {
            return;
        }
        imageView9.setVisibility(8);
    }

    public final int Y(int i) {
        if (C31160CKu.LIZ() && i == 0) {
            View view = this.LJLLILLLL;
            if (view != null) {
                return view.getVisibility();
            }
            return 4;
        }
        return i;
    }

    public final void a0(ImageModel imageModel) {
        int LIZJ = C30760C5k.LIZJ();
        C30760C5k.LJ(this.LJLJLJ, imageModel, LIZJ, LIZJ, R.drawable.d1o, new C32708Csa(this), 16);
    }

    public final void g0(int i) {
        if (C31160CKu.LIZ()) {
            if (i == 0) {
                View view = this.LJLLILLLL;
                if (view != null) {
                    view.setVisibility(0);
                }
                C47121t6 c47121t6 = this.LJLLLL;
                if (c47121t6 != null) {
                    c47121t6.setVisibility(0);
                }
                C47121t6 c47121t62 = this.LJLJJL;
                if (c47121t62 != null) {
                    c47121t62.setVisibility(0);
                }
                C47121t6 c47121t63 = this.LJLJJI;
                if (c47121t63 != null) {
                    c47121t63.setVisibility(8);
                }
                C47121t6 c47121t64 = this.LJLJLLL;
                if (c47121t64 != null) {
                    c47121t64.setVisibility(8);
                }
                C47121t6 c47121t65 = this.LJLLL;
                if (c47121t65 != null) {
                    c47121t65.setVisibility(4);
                }
                C47121t6 c47121t66 = this.LJLLLLLL;
                if (c47121t66 == null) {
                    return;
                }
                c47121t66.setVisibility(Y(4));
                return;
            }
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            C47121t6 c47121t67 = this.LJLLLL;
            if (c47121t67 != null) {
                c47121t67.setVisibility(4);
            }
            C47121t6 c47121t68 = this.LJLJJL;
            if (c47121t68 != null) {
                c47121t68.setVisibility(8);
            }
            C47121t6 c47121t69 = this.LJLJJI;
            if (c47121t69 != null) {
                c47121t69.setVisibility(0);
            }
            C47121t6 c47121t610 = this.LJLJLLL;
            if (c47121t610 != null) {
                c47121t610.setVisibility(0);
            }
            C47121t6 c47121t611 = this.LJLLL;
            if (c47121t611 != null) {
                c47121t611.setVisibility(4);
            }
            C47121t6 c47121t612 = this.LJLLLLLL;
            if (c47121t612 == null) {
                return;
            }
            c47121t612.setVisibility(Y(4));
            return;
        }
        View view3 = this.LJLLILLLL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(i);
    }

    public final void h0(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (i != 0 && i2 != 0) {
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (C15380j0.LIZ(13.0f) * i) / i2;
                }
            } else {
                layoutParams = null;
            }
            ImageView imageView2 = this.LJLJI;
            if (imageView2 == null) {
                return;
            }
            imageView2.setLayoutParams(layoutParams);
        }
    }

    public void N(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, DataChannel dataChannel, int i) {
        Room room;
        long ownerUserId;
        C32470Cok c32470Cok;
        FreqLimitGiftOption freqLimitOption;
        Integer num;
        int intValue;
        C47121t6 c47121t6;
        AbstractC32756CtM abstractC32756CtM;
        char c;
        int i2;
        ImageModel imageModel;
        float f;
        int i3;
        ImageModel imageModel2;
        long j;
        long j2;
        C77557UcD c77557UcD;
        Long l;
        int i4;
        Gift gift;
        if (C30922CBq.LIZIZ) {
            long LIZJ = abstractC32698CsQ.LIZJ();
            T t = abstractC32698CsQ.LIZIZ;
            if ((t instanceof Gift) && (gift = (Gift) t) != null) {
                i4 = gift.type;
            } else {
                i4 = 0;
            }
            View view = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            String LJFF = abstractC32698CsQ.LJFF();
            if (LJFF == null) {
                LJFF = "";
            }
            LIZ.append(LJFF);
            LIZ.append(",selected:");
            C1FL.LJFF(LIZ, abstractC32698CsQ.LIZJ, ",type:", i4, ",gift id:");
            C06510Nj.LIZIZ(LIZ, LIZJ, "},gift index:", i);
            view.setTag(X1D.LIZIZ(LIZ));
        }
        if (C32694CsM.LJIIJJI) {
            C32694CsM.LJIIJJI = false;
            C32694CsM.LJIIL = SystemClock.uptimeMillis();
        }
        this.LJZ = abstractC32698CsQ;
        C47121t6 c47121t62 = this.LJLLLL;
        if (c47121t62 != null) {
            c47121t62.setText(C15380j0.LJIILJJIL(R.string.o1j));
        }
        c0();
        V(dataChannel);
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJZ;
        if (abstractC32698CsQ2 != null && abstractC32698CsQ2.LIZJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("view holder in ");
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LJZ;
            if (abstractC32698CsQ3 != null) {
                l = Long.valueOf(abstractC32698CsQ3.LIZJ());
            } else {
                l = null;
            }
            LIZ2.append(l);
            LIZ2.append(" @ position ");
            LIZ2.append(i);
            LIZ2.append(" is selected");
            Logger.i("BAGS", X1D.LIZIZ(LIZ2));
            f0();
        }
        if (!abstractC32698CsQ.LJIIL() && !abstractC32698CsQ.LJIIIIZZ()) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = this.LJZ;
            if (abstractC32698CsQ4 != null && abstractC32698CsQ4.LIZLLL && !X()) {
                if (!LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
                    if (this.LJLLJ == null) {
                        ViewStub viewStub = (ViewStub) this.LJLIL.findViewById(R.id.dv6);
                        if (viewStub == null) {
                            c77557UcD = (C77557UcD) this.LJLIL.findViewById(R.id.dt0);
                        } else {
                            View inflate = viewStub.inflate();
                            if (inflate instanceof C77557UcD) {
                                c77557UcD = (C77557UcD) inflate;
                            } else {
                                c77557UcD = null;
                            }
                        }
                        this.LJLLJ = c77557UcD;
                    }
                    C77557UcD c77557UcD2 = this.LJLLJ;
                    if (c77557UcD2 != null) {
                        c77557UcD2.setVisibility(0);
                    }
                    C29306Beo.LJIIIZ(this.LJLILLLLZI);
                    C77557UcD c77557UcD3 = this.LJLLJ;
                    if (c77557UcD3 != null) {
                        ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(this, 210);
                        ARunnableS41S0100000_5 aRunnableS41S0100000_52 = new ARunnableS41S0100000_5(this, 211);
                        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 = this.LJZ;
                        if (abstractC32698CsQ5 != null) {
                            j2 = abstractC32698CsQ5.LIZJ();
                        } else {
                            j2 = 0;
                        }
                        c77557UcD3.LIZJ(aRunnableS41S0100000_5, aRunnableS41S0100000_52, j2, "gift_panel", "gift_panel", SystemClock.uptimeMillis() - C32694CsM.LJJIJIIJI);
                    }
                } else {
                    C29306Beo.LJIIIZ(this.LJLILLLLZI);
                    InterfaceC32725Csr interfaceC32725Csr = this.LJZI;
                    if (interfaceC32725Csr != null) {
                        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ6 = this.LJZ;
                        if (abstractC32698CsQ6 != null) {
                            j = abstractC32698CsQ6.LIZJ();
                        } else {
                            j = 0;
                        }
                        interfaceC32725Csr.LJIIIZ(j, this.LJLIL.getX(), this.LJLIL.getY(), i, new AqS155S0100000_5(this, 300));
                    }
                }
            } else {
                if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
                    InterfaceC32725Csr interfaceC32725Csr2 = this.LJZI;
                    if (interfaceC32725Csr2 != null) {
                        interfaceC32725Csr2.LIZJ(false);
                    }
                } else {
                    C77557UcD c77557UcD4 = this.LJLLJ;
                    if (c77557UcD4 != null) {
                        c77557UcD4.setVisibility(8);
                    }
                    C77557UcD c77557UcD5 = this.LJLLJ;
                    if (c77557UcD5 != null) {
                        c77557UcD5.LIZLLL();
                    }
                }
                C29306Beo.LJJLJLI(this.LJLILLLLZI);
            }
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ7 = this.LJZ;
        if (abstractC32698CsQ7 != null && (imageModel = abstractC32698CsQ7.LJ) != null) {
            if (abstractC32698CsQ7.LJI) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            if (C15380j0.LJIIZILJ()) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            float f2 = i3 * f;
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ8 = this.LJZ;
            if (abstractC32698CsQ8 != null) {
                imageModel2 = abstractC32698CsQ8.LJFF;
            } else {
                imageModel2 = null;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimator = new ObjectAnimator();
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            ObjectAnimator objectAnimator3 = new ObjectAnimator();
            ObjectAnimator objectAnimator4 = new ObjectAnimator();
            ObjectAnimator objectAnimator5 = new ObjectAnimator();
            ObjectAnimator objectAnimator6 = new ObjectAnimator();
            ObjectAnimator objectAnimator7 = new ObjectAnimator();
            ObjectAnimator objectAnimator8 = new ObjectAnimator();
            C47061t0 c47061t0 = this.LJLJLJ;
            if (c47061t0 != null) {
                objectAnimator4 = C1DG.LIZJ(c47061t0, View.ALPHA, new float[]{1.0f, 0.0f}, "ofFloat(it, View.ALPHA, 1F, 0F)", 300L);
                objectAnimator6 = C1DG.LIZJ(c47061t0, View.SCALE_X, new float[]{1.0f, 0.4f}, "ofFloat(it, View.SCALE_X, 1F, 0.4F)", 300L);
                objectAnimator5 = C1DG.LIZJ(c47061t0, View.SCALE_Y, new float[]{1.0f, 0.4f}, "ofFloat(it, View.SCALE_Y, 1F, 0.4F)", 300L);
                objectAnimator7 = C1DG.LIZJ(c47061t0, View.TRANSLATION_X, new float[]{0.0f, (-1) * f2 * 300.0f}, "ofFloat(it, View.TRANSLA… innerCoefficient * 300F)", 300L);
            }
            C47061t0 c47061t02 = this.LJLJL;
            if (c47061t02 != null) {
                objectAnimator = C1DG.LIZJ(c47061t02, View.ALPHA, new float[]{0.0f, 1.0f}, "ofFloat(it, View.ALPHA, 0F, 1F)", 300L);
                objectAnimator3 = C1DG.LIZJ(c47061t02, View.SCALE_X, new float[]{0.4f, 1.0f}, "ofFloat(it, View.SCALE_X, 0.4F, 1F)", 300L);
                objectAnimator2 = C1DG.LIZJ(c47061t02, View.SCALE_Y, new float[]{0.4f, 1.0f}, "ofFloat(it, View.SCALE_Y, 0.4F, 1F)", 300L);
                objectAnimator8 = C1DG.LIZJ(c47061t02, View.TRANSLATION_X, new float[]{300.0f * f2, 0.0f}, "ofFloat(it, View.TRANSLA…erCoefficient * 300F, 0F)", 300L);
                int LIZJ2 = C30760C5k.LIZJ();
                C30760C5k.LIZ(LIZJ2, LIZJ2, imageModel, c47061t02);
            }
            animatorSet.addListener(new C32717Csj(this, f2, imageModel2));
            animatorSet.playTogether(objectAnimator4, objectAnimator6, objectAnimator5, objectAnimator, objectAnimator3, objectAnimator2, objectAnimator7, objectAnimator8);
            animatorSet.start();
        }
        L(i);
        if (!((Boolean) C31160CKu.LIZLLL.getValue()).booleanValue()) {
            M();
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ9 = this.LJZ;
        if ((abstractC32698CsQ9 instanceof C32739Ct5) && (abstractC32756CtM = (AbstractC32756CtM) abstractC32698CsQ9) != null) {
            int LJIILIIL = abstractC32756CtM.LJIILIIL();
            ImageView imageView = this.LJLL;
            if (imageView == null) {
                i2 = 1;
                c = 0;
            } else {
                c = 0;
                imageView.setVisibility(0);
                i2 = 1;
            }
            Object[] objArr = new Object[i2];
            objArr[c] = String.valueOf(LJIILIIL);
            String LJIILL = C15380j0.LJIILL(R.string.stq, objArr);
            C47121t6 c47121t63 = this.LJLJLLL;
            if (c47121t63 != null) {
                c47121t63.setText(LJIILL);
            }
            C47121t6 c47121t64 = this.LJLJJL;
            if (c47121t64 != null) {
                c47121t64.setText(LJIILL);
            }
        }
        this.LLFFF.LIZLLL();
        if (abstractC32698CsQ.LIZ != 14) {
            U();
        }
        if (!C31160CKu.LIZLLL()) {
            i0();
        }
        if (!this.LL && (c47121t6 = this.LJLLLL) != null) {
            c47121t6.setBackgroundResource(R.drawable.d4e);
        }
        C47121t6 c47121t65 = this.LJLLLL;
        if (c47121t65 != null) {
            c47121t65.setTextColor(this.LJLIL.getResources().getColor(R.color.bc));
        }
        this.LJZL = false;
        long LIZJ3 = abstractC32698CsQ.LIZJ();
        if (C31160CKu.LIZLLL()) {
            InterfaceC32725Csr interfaceC32725Csr3 = this.LJZI;
            if (interfaceC32725Csr3 != null) {
                ownerUserId = interfaceC32725Csr3.LJJIII();
            }
            ownerUserId = 0;
        } else {
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                ownerUserId = room.getOwnerUserId();
            }
            ownerUserId = 0;
        }
        HashMap<Long, C32470Cok> hashMap = GiftManager.inst().freqLimitInfoList;
        if (hashMap == null || (c32470Cok = hashMap.get(Long.valueOf(LIZJ3))) == null || (freqLimitOption = GiftManager.inst().getFreqLimitOption(Long.valueOf(LIZJ3))) == null) {
            return;
        }
        if (!c32470Cok.LIZIZ || (num = (Integer) ((LinkedHashMap) c32470Cok.LIZJ).get(Long.valueOf(ownerUserId))) == null) {
            intValue = c32470Cok.LIZ;
        } else {
            intValue = num.intValue();
        }
        if (intValue > 0 || freqLimitOption.refreshTimeStamp <= System.currentTimeMillis() / 1000) {
            return;
        }
        C47121t6 c47121t66 = this.LJLLLL;
        if (c47121t66 != null) {
            c47121t66.setBackgroundResource(R.drawable.d3a);
        }
        C47121t6 c47121t67 = this.LJLLLL;
        if (c47121t67 != null) {
            c47121t67.setTextColor(ColorProtector.parseColor("#57ffffff"));
        }
        this.LJZL = true;
    }
}
