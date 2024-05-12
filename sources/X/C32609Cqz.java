package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS16S1200000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.RandomGiftBubble;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Cqz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32609Cqz extends FrameLayout implements InterfaceC32639CrT, InterfaceC32649Crd, InterfaceC32645CrZ {
    public InterfaceC32642CrW LJLIL;
    public View LJLILLLLZI;
    public ImageView LJLJI;
    public C47061t0 LJLJJI;
    public View LJLJJL;
    public C32638CrS LJLJJLL;
    public final C32612Cr2 LJLJL;
    public final C32640CrU LJLJLJ;
    public final C73318Sq2 LJLJLLL;
    public final DataChannel LJLL;
    public long LJLLI;
    public EnumC32618Cr8 LJLLILLLL;
    public String LJLLJ;
    public final boolean LJLLL;
    public final long LJLLLL;
    public final long LJLLLLLL;
    public C73411SrX LJLZ;
    public final ConcurrentLinkedQueue<C32629CrJ> LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;
    public final ARunnableS41S0100000_5 LLF;
    public final C32615Cr5 LLFF;
    public final C32617Cr7 LLFFF;

    /* JADX WARN: Type inference failed for: r5v2, types: [X.Cr6, O] */
    public final void LJII() {
        EnumC32626CrG enumC32626CrG;
        int i;
        if (this.LJZ.isEmpty() || this.LJZL || this.LJZI) {
            return;
        }
        this.LJZI = true;
        C32629CrJ poll = this.LJZ.poll();
        if (poll != null && (enumC32626CrG = poll.LIZ) != null) {
            int i2 = C32630CrK.LIZ[enumC32626CrG.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 || i2 == 5) {
                            C73943T0h LIZ = C73943T0h.LIZ();
                            Integer num = poll.LIZLLL;
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = 0;
                            }
                            LIZ.LIZIZ(new C32652Crg(i));
                            ((C32537Cpp) this.LJLL.gv0(C32648Crc.class)).LIZ = new C32616Cr6(poll.LIZLLL, poll.LJ, System.currentTimeMillis(), EnumC124204u8.BUBBLE);
                            this.LJLJLLL.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(2250L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(this, poll, 71), C32641CrV.LJLIL));
                        }
                    } else {
                        LJIIIIZZ(this.LJLLILLLL, this.LJLLJ);
                    }
                } else {
                    LJIIIIZZ(EnumC32618Cr8.WEEKLY_RANKING_GIFT, C15640jQ.LIZ(poll.LIZIZ));
                    this.LJLZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(this.LJLLLL, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 338));
                }
            } else {
                C32633CrN c32633CrN = new C32633CrN(EnumC32608Cqy.COLOR_GIFT, EnumC32627CrH.ANIMATION, poll.LIZJ);
                InterfaceC32642CrW interfaceC32642CrW = this.LJLIL;
                if (interfaceC32642CrW != null) {
                    interfaceC32642CrW.LIZ(c32633CrN);
                }
                C47061t0 c47061t0 = this.LJLJJI;
                if (c47061t0 != null) {
                    C29306Beo.LJJLIIIJJI(c47061t0, true);
                }
                C47061t0 c47061t02 = this.LJLJJI;
                if (c47061t02 != null) {
                    C15640jQ.LIZJ(-1, -1, R.drawable.d1p, c47061t02, poll.LIZIZ, new IDdS56S0100000_5(this, 13), true);
                }
            }
        }
        this.LJLZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(this.LJLLLLLL, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 339));
    }

    public final void LJIIIZ() {
        ImageView imageView;
        View view;
        boolean LJ = o.LJ(this.LJLL.kv0(BCW.class), Boolean.TRUE);
        if (!this.LJLLL && !LJ && (view = this.LJLILLLLZI) != null) {
            view.setBackgroundResource(0);
        }
        ImageView imageView2 = this.LJLJI;
        if (imageView2 != null && imageView2.getDrawable() == null && (imageView = this.LJLJI) != null) {
            imageView.setImageResource(R.drawable.d33);
        }
    }

    public final InterfaceC32642CrW getMIView() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC32645CrZ
    public final void LIZ(long j) {
        InterfaceC30442Bx8.d.LIZ(Long.valueOf(j));
        View view = this.LJLJJL;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        View view3 = this.LJLJJL;
        if (view3 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
        C32633CrN c32633CrN = new C32633CrN(EnumC32608Cqy.COLOR_GIFT, EnumC32627CrH.DOT, j);
        InterfaceC32642CrW interfaceC32642CrW = this.LJLIL;
        if (interfaceC32642CrW != null) {
            interfaceC32642CrW.LIZIZ(c32633CrN);
        }
        InterfaceC30442Bx8.c.LIZ(Boolean.TRUE);
        C32000ChA.LIZIZ(Long.valueOf(j));
    }

    @Override // X.InterfaceC32649Crd
    public final void LIZJ(long j) {
        String str;
        RandomGiftBubble randomGiftBubble;
        Gift LIZLLL = C32341Cmf.LIZLLL(j);
        C32633CrN c32633CrN = new C32633CrN(EnumC32608Cqy.RANDOM_GIFT, EnumC32627CrH.BUBBLE, j);
        if (LIZLLL != null) {
            ImageModel imageModel = LIZLLL.icon;
            GiftRandomEffectInfo giftRandomEffectInfo = LIZLLL.randomEffectInfo;
            if (giftRandomEffectInfo != null && (randomGiftBubble = giftRandomEffectInfo.randomGiftBubble) != null) {
                str = randomGiftBubble.bubbleDisplayText;
            } else {
                str = null;
            }
            C32643CrX c32643CrX = new C32643CrX(this);
            c32643CrX.LJIILIIL = this.LLFFF;
            c32643CrX.LJIIL = new C32611Cr1(this, c32633CrN);
            c32643CrX.LJI = 5000L;
            c32643CrX.LJII = true;
            c32643CrX.LJIJJLI = imageModel;
            if (str == null) {
                str = "";
            }
            c32643CrX.LJIILLIIL = str;
            C30770C5u.LIZLLL(new C32613Cr3(c32643CrX), C09.RANDOM_EFFECT_GIFT);
        }
    }

    @Override // X.InterfaceC32639CrT
    public final void LJ(ImageModel imageModel) {
        this.LJZ.add(new C32629CrJ(EnumC32626CrG.WEEKLY_RANKING_GIFT, imageModel, 0L));
        LJII();
    }

    @Override // X.InterfaceC32645CrZ
    public final void LJFF(long j) {
        String str;
        InterfaceC30442Bx8.d.LIZ(Long.valueOf(j));
        Gift LIZLLL = C32341Cmf.LIZLLL(j);
        C32633CrN c32633CrN = new C32633CrN(EnumC32608Cqy.COLOR_GIFT, EnumC32627CrH.BUBBLE, j);
        this.LJLLI = j;
        C1YG c1yg = new C1YG(this);
        c1yg.LJIILIIL = this.LLFF;
        c1yg.LJIIL = new C32620CrA(this, c32633CrN, j);
        c1yg.LJI = 5000L;
        c1yg.LJII = true;
        Context context = getContext();
        Object[] objArr = new Object[1];
        if (LIZLLL == null || (str = LIZLLL.name) == null) {
            str = "";
        }
        objArr[0] = str;
        c1yg.LJIILLIIL = context.getString(R.string.mh5, objArr);
        C30770C5u.LIZLLL(new C1YH(c1yg), C09.CHANGE_COLOR_GIFT);
    }

    public final void setMIView(InterfaceC32642CrW interfaceC32642CrW) {
        this.LJLIL = interfaceC32642CrW;
    }

    public final void setShowingBubbleGuide(boolean z) {
        this.LJZL = z;
    }

    @Override // X.InterfaceC32645CrZ
    public final void LIZIZ(ImageModel imageModel, long j) {
        this.LJZ.add(new C32629CrJ(EnumC32626CrG.WEEKLY_RANKING_GIFT, imageModel, j));
        LJII();
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00b3, code lost:
    
        if (r0 > (java.lang.System.currentTimeMillis() / r8)) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.bytedance.android.livesdk.gift.model.GiftIconInfo] */
    /* JADX WARN: Type inference failed for: r2v74 */
    @Override // X.InterfaceC32639CrT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdk.gift.model.GiftsInfo r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32609Cqz.LIZLLL(com.bytedance.android.livesdk.gift.model.GiftsInfo, boolean):void");
    }

    @Override // X.InterfaceC32639CrT
    public final void LJI(Integer num, Long l) {
        EnumC32626CrG enumC32626CrG;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        ConcurrentLinkedQueue<C32629CrJ> concurrentLinkedQueue = this.LJZ;
        if (num.intValue() == 1) {
            enumC32626CrG = EnumC32626CrG.MATCH_ITEM_CRITICAL;
        } else {
            enumC32626CrG = EnumC32626CrG.MATCH_ITEM_SMOKE;
        }
        concurrentLinkedQueue.offer(new C32629CrJ(enumC32626CrG, null, 0L, num, l));
        LJII();
    }

    public final void LJIIIIZZ(EnumC32618Cr8 enumC32618Cr8, String str) {
        this.LJLJLLL.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(5L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS16S1200000_5(enumC32618Cr8, this, str, 2)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32609Cqz(Context context, DataChannel dataChannel, InterfaceC32642CrW interfaceC32642CrW) {
        super(context);
        boolean z;
        o.LJIIIZ(dataChannel, "dataChannel");
        new LinkedHashMap();
        this.LJLIL = interfaceC32642CrW;
        this.LJLJL = new C32612Cr2();
        this.LJLJLJ = new C32640CrU();
        this.LJLJLLL = new C73318Sq2();
        this.LJLL = dataChannel;
        this.LJLLILLLL = EnumC32618Cr8.DAILY;
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLLL = z;
        this.LJLLLL = 20L;
        this.LJLLLLLL = 30L;
        this.LJZ = new ConcurrentLinkedQueue<>();
        this.LLF = new ARunnableS41S0100000_5(this, 316);
        this.LLFF = new C32615Cr5(this);
        this.LLFFF = new C32617Cr7(this);
    }
}
