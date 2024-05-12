package X;

import Y.ACListenerS40S0200000_5;
import Y.AObjectS88S0101000_7;
import Y.ARunnableS41S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.os.SystemClock;
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
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Cs5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32677Cs5 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public ViewGroup LJLILLLLZI;
    public ImageView LJLJI;
    public C47121t6 LJLJJI;
    public C47061t0 LJLJJL;
    public DataChannel LJLJJLL;
    public ImageView LJLJL;
    public AbstractC32698CsQ<?> LJLJLJ;
    public InterfaceC32671Crz LJLJLLL;
    public C77557UcD LJLL;
    public View LJLLI;
    public C47121t6 LJLLILLLL;
    public C47121t6 LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public LiveIconView LJLLLLLL;
    public C47121t6 LJLZ;
    public final C73318Sq2 LJZ;

    public boolean N() {
        return false;
    }

    public void onDestroy() {
    }

    public void M() {
        AbstractC32698CsQ<?> abstractC32698CsQ;
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
            if (interfaceC32671Crz != null) {
                T2J.LJII(((LiveNewGiftPanelWidget) ((AbstractC32682CsA) interfaceC32671Crz).LJLJJL).LJLILLLLZI, true);
            }
        } else {
            C77557UcD c77557UcD = this.LJLL;
            if (c77557UcD != null) {
                c77557UcD.setVisibility(8);
            }
            C77557UcD c77557UcD2 = this.LJLL;
            if (c77557UcD2 != null) {
                c77557UcD2.LIZLLL();
            }
        }
        this.LJLLL = false;
        C29306Beo.LJJLJLI(this.LJLILLLLZI);
        InterfaceC32671Crz interfaceC32671Crz2 = this.LJLJLLL;
        if (interfaceC32671Crz2 != null) {
            abstractC32698CsQ = ((AbstractC32682CsA) interfaceC32671Crz2).LJLIL;
        } else {
            abstractC32698CsQ = null;
        }
        if (abstractC32698CsQ == this.LJLJLJ) {
            U();
        }
    }

    public void P() {
        long j;
        String str;
        ImageModel LIZLLL;
        List<String> urls;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        ImageModel imageModel = null;
        if (abstractC32698CsQ != null && abstractC32698CsQ.LIZLLL() != null) {
            AbstractC32698CsQ<?> abstractC32698CsQ2 = this.LJLJLJ;
            if (abstractC32698CsQ2 != null) {
                j = abstractC32698CsQ2.LIZJ();
            } else {
                j = -1;
            }
            AbstractC32698CsQ<?> abstractC32698CsQ3 = this.LJLJLJ;
            if (abstractC32698CsQ3 == null || (LIZLLL = abstractC32698CsQ3.LIZLLL()) == null || (urls = LIZLLL.getUrls()) == null || (str = (String) ListProtector.get(urls, 0)) == null) {
                str = "";
            }
            C73411SrX LJIIIIZZ = C73542Ste.LJIIIIZZ(AbstractC73672Svk.LJIIJ(new C32746CtC(j, UriProtector.parse(str), null)), C32771Ctb.LJLIL, null, new C32731Csx(), 2);
            C73318Sq2 cb = this.LJZ;
            o.LJIIIZ(cb, "cb");
            cb.LIZ(LJIIIIZZ);
            int LIZJ = C30760C5k.LIZJ();
            C47061t0 c47061t0 = this.LJLJJL;
            AbstractC32698CsQ<?> abstractC32698CsQ4 = this.LJLJLJ;
            if (abstractC32698CsQ4 != null) {
                imageModel = abstractC32698CsQ4.LIZLLL();
            }
            C30760C5k.LIZIZ(c47061t0, imageModel, R.drawable.d1o, new C32702CsU(this), LIZJ, LIZJ);
        }
    }

    public final void Q() {
        String str;
        boolean z;
        String str2;
        AbstractC32698CsQ<?> abstractC32698CsQ;
        ImageView imageView;
        ImageModel LJ;
        ImageModel imageModel;
        ImageView imageView2;
        ImageModel LJ2;
        AbstractC32698CsQ<?> abstractC32698CsQ2 = this.LJLJLJ;
        DataChannel dataChannel = this.LJLJJLL;
        ImageModel imageModel2 = null;
        AbstractC32698CsQ<?> abstractC32698CsQ3 = null;
        if (abstractC32698CsQ2 != null && (LJ2 = abstractC32698CsQ2.LJ()) != null) {
            str = LJ2.getUri();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C32502CpG.LIZLLL(abstractC32698CsQ2, dataChannel, z)) {
            InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
            if (interfaceC32671Crz != null) {
                abstractC32698CsQ3 = ((AbstractC32682CsA) interfaceC32671Crz).LJLIL;
            }
            if (abstractC32698CsQ3 != this.LJLJLJ && (imageView2 = this.LJLJI) != null) {
                C29306Beo.LJJLJLI(imageView2);
            }
            C32476Coq c32476Coq = C32502CpG.LIZIZ().LIZIZ;
            if (c32476Coq != null && (imageModel = c32476Coq.LIZ) != null) {
                C30760C5k.LJ(this.LJLJI, imageModel, 0, 0, 0, new IDdS56S0100000_5(this, 12), 60);
                return;
            }
            return;
        }
        AbstractC32698CsQ<?> abstractC32698CsQ4 = this.LJLJLJ;
        if (abstractC32698CsQ4 != null && abstractC32698CsQ4.LJ() != null && this.LJLJI != null) {
            AbstractC32698CsQ<?> abstractC32698CsQ5 = this.LJLJLJ;
            if (abstractC32698CsQ5 != null && (LJ = abstractC32698CsQ5.LJ()) != null) {
                str2 = LJ.getUri();
            } else {
                str2 = null;
            }
            if (C29306Beo.LJIJJLI(str2)) {
                InterfaceC32671Crz interfaceC32671Crz2 = this.LJLJLLL;
                if (interfaceC32671Crz2 != null) {
                    abstractC32698CsQ = ((AbstractC32682CsA) interfaceC32671Crz2).LJLIL;
                } else {
                    abstractC32698CsQ = null;
                }
                if (abstractC32698CsQ != this.LJLJLJ && (imageView = this.LJLJI) != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView3 = this.LJLJI;
                AbstractC32698CsQ<?> abstractC32698CsQ6 = this.LJLJLJ;
                if (abstractC32698CsQ6 != null) {
                    imageModel2 = abstractC32698CsQ6.LJ();
                }
                C30760C5k.LJ(imageView3, imageModel2, -1, -1, 0, new IDdS56S0100000_5(this, 11), 48);
                return;
            }
        }
        ImageView imageView4 = this.LJLJI;
        if (imageView4 == null) {
            return;
        }
        imageView4.setVisibility(8);
    }

    public void T() {
        this.LJLJI = (ImageView) this.LJLIL.findViewById(R.id.fp0);
        this.LJLJJI = (C47121t6) this.LJLIL.findViewById(R.id.gzi);
        this.LJLJJL = (C47061t0) this.LJLIL.findViewById(R.id.gzh);
        this.LJLLI = this.LJLIL.findViewById(R.id.lpz);
        this.LJLLILLLL = (C47121t6) this.LJLIL.findViewById(R.id.etp);
        this.LJLLJ = (C47121t6) this.LJLIL.findViewById(R.id.euy);
        this.LJLILLLLZI = (ViewGroup) this.LJLIL.findViewById(R.id.btg);
        C47121t6 c47121t6 = this.LJLLJ;
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("bold"));
        }
        C47121t6 c47121t62 = this.LJLJJI;
        if (c47121t62 != null) {
            c47121t62.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        this.LJLZ = (C47121t6) this.LJLIL.findViewById(R.id.euz);
        this.LJLLLLLL = (LiveIconView) this.LJLIL.findViewById(R.id.kqh);
    }

    public void U() {
        boolean z;
        Gift gift;
        GiftLockInfo giftLockInfo;
        InterfaceC136265Wk interfaceC136265Wk;
        View view = this.LJLLI;
        if (view != null) {
            view.setVisibility(0);
        }
        LiveIconView liveIconView = this.LJLLLLLL;
        if (liveIconView != null) {
            liveIconView.setVisibility(8);
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
        if (interfaceC32671Crz != null && (interfaceC136265Wk = ((AbstractC32682CsA) interfaceC32671Crz).LJLJJL) != null && ((LiveNewGiftPanelWidget) interfaceC136265Wk).LJLZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C47121t6 c47121t6 = this.LJLZ;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            C47121t6 c47121t62 = this.LJLLILLLL;
            if (c47121t62 != null) {
                c47121t62.setVisibility(4);
            }
            C47121t6 c47121t63 = this.LJLLJ;
            if (c47121t63 == null) {
                return;
            }
            c47121t63.setVisibility(4);
            return;
        }
        if (C32833Cub.LIZLLL == EnumC35442Dva.ItemCountdown) {
            C47121t6 c47121t64 = this.LJLLILLLL;
            if (c47121t64 != null) {
                c47121t64.setVisibility(0);
            }
            C47121t6 c47121t65 = this.LJLLJ;
            if (c47121t65 != null) {
                c47121t65.setVisibility(4);
            }
            C47121t6 c47121t66 = this.LJLZ;
            if (c47121t66 == null) {
                return;
            }
            c47121t66.setVisibility(4);
            return;
        }
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        Object obj = null;
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        }
        if (((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLock) || Y()) {
            C47121t6 c47121t67 = this.LJLZ;
            if (c47121t67 != null) {
                c47121t67.setVisibility(0);
            }
            C47121t6 c47121t68 = this.LJLLJ;
            if (c47121t68 != null) {
                c47121t68.setVisibility(4);
            }
            C47121t6 c47121t69 = this.LJLLILLLL;
            if (c47121t69 == null) {
                return;
            }
            c47121t69.setVisibility(4);
            return;
        }
        C47121t6 c47121t610 = this.LJLLJ;
        if (c47121t610 != null) {
            c47121t610.setVisibility(0);
        }
        C47121t6 c47121t611 = this.LJLZ;
        if (c47121t611 != null) {
            c47121t611.setVisibility(4);
        }
        C47121t6 c47121t612 = this.LJLLILLLL;
        if (c47121t612 == null) {
            return;
        }
        c47121t612.setVisibility(4);
    }

    public final void V() {
        AbstractC32698CsQ<?> abstractC32698CsQ;
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
            if (interfaceC32671Crz != null) {
                T2J.LJII(((LiveNewGiftPanelWidget) ((AbstractC32682CsA) interfaceC32671Crz).LJLJJL).LJLILLLLZI, false);
            }
        } else {
            C77557UcD c77557UcD = this.LJLL;
            if (c77557UcD != null) {
                c77557UcD.setVisibility(8);
            }
        }
        C29306Beo.LJJLJLI(this.LJLILLLLZI);
        InterfaceC32671Crz interfaceC32671Crz2 = this.LJLJLLL;
        if (interfaceC32671Crz2 != null) {
            abstractC32698CsQ = ((AbstractC32682CsA) interfaceC32671Crz2).LJLIL;
        } else {
            abstractC32698CsQ = null;
        }
        if (abstractC32698CsQ == this.LJLJLJ) {
            U();
        }
    }

    public void X() {
        Gift gift;
        GiftLockInfo giftLockInfo;
        GiftLockInfo giftLockInfo2;
        View view = this.LJLLI;
        if (view != null) {
            view.setVisibility(4);
        }
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        Object obj = null;
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLock && (giftLockInfo2 = gift.giftSubInfo) != null && giftLockInfo2.mLockType == 1) {
            LiveIconView liveIconView = this.LJLLLLLL;
            if (liveIconView == null) {
                return;
            }
            liveIconView.setVisibility(0);
            return;
        }
        LiveIconView liveIconView2 = this.LJLLLLLL;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setVisibility(8);
    }

    public final boolean Y() {
        boolean z;
        Gift gift;
        GiftLockInfo giftLockInfo;
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (gr != null && gr.LJFF == 2) {
            z = true;
        } else {
            z = false;
        }
        Object obj = this.LJLJLJ;
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 3 && z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32677Cs5(View mRootView) {
        super(mRootView);
        o.LJIIIZ(mRootView, "mRootView");
        this.LJLIL = mRootView;
        this.LJZ = new C73318Sq2();
        T();
    }

    public void a0(long j) {
        String LIZIZ;
        String LIZIZ2;
        if (j > 0) {
            int i = (int) (j / 1000);
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 >= 10) {
                LIZIZ = String.valueOf(i2);
            } else {
                LIZIZ = C169696lJ.LIZIZ('0', i2);
            }
            if (i3 >= 10) {
                LIZIZ2 = String.valueOf(i3);
            } else {
                LIZIZ2 = C169696lJ.LIZIZ('0', i3);
            }
            String LJ = a1.LJ(LIZIZ, " : ", LIZIZ2);
            C47121t6 c47121t6 = this.LJLLILLLL;
            if (c47121t6 == null) {
                return;
            }
            c47121t6.setText(LJ);
        }
    }

    public void c0(InterfaceC32671Crz listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(this, listener, 62), this.LJLIL);
        this.LJLIL.setOnTouchListener(new IDTListenerS115S0100000_5(this, 19));
        this.LJLJLLL = listener;
    }

    public void g0(long j) {
        Object obj;
        C77557UcD c77557UcD;
        Gift gift;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        if (abstractC32698CsQ != null && j == abstractC32698CsQ.LIZJ()) {
            AbstractC32698CsQ<?> abstractC32698CsQ2 = this.LJLJLJ;
            if (abstractC32698CsQ2 == null || (abstractC32698CsQ2 instanceof C32739Ct5)) {
                Boolean bool = null;
                if (abstractC32698CsQ2 != null) {
                    obj = abstractC32698CsQ2.LIZIZ;
                } else {
                    obj = null;
                }
                if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
                    bool = Boolean.valueOf(gift.LIZ());
                }
                if (!C29306Beo.LJJIFFI(bool)) {
                    C29306Beo.LJIIIZ(this.LJLILLLLZI);
                    if (!LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
                        if (this.LJLL == null) {
                            ViewStub viewStub = (ViewStub) this.LJLIL.findViewById(R.id.dv6);
                            if (viewStub != null) {
                                View inflate = viewStub.inflate();
                                o.LJII(inflate, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.utils.animation.view.LiveNewSendGiftAnimationView");
                                c77557UcD = (C77557UcD) inflate;
                            } else {
                                c77557UcD = (C77557UcD) this.LJLIL.findViewById(R.id.dt0);
                            }
                            this.LJLL = c77557UcD;
                        }
                        C77557UcD c77557UcD2 = this.LJLL;
                        if (c77557UcD2 != null) {
                            c77557UcD2.setVisibility(0);
                        }
                        C77557UcD c77557UcD3 = this.LJLL;
                        if (c77557UcD3 != null) {
                            c77557UcD3.LIZJ(new ARunnableS41S0100000_5(this, 286), new ARunnableS41S0100000_5(this, 287), j, "gift_panel", "gift_panel", SystemClock.uptimeMillis() - C32694CsM.LJJIJIIJI);
                        }
                    } else {
                        InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
                        if (interfaceC32671Crz != null) {
                            float x = this.LJLIL.getX();
                            float y = this.LJLIL.getY();
                            int bindingAdapterPosition = getBindingAdapterPosition();
                            AqS166S0100000_16 aqS166S0100000_16 = new AqS166S0100000_16(this, 28);
                            C77557UcD c77557UcD4 = ((LiveNewGiftPanelWidget) ((AbstractC32682CsA) interfaceC32671Crz).LJLJJL).LJLILLLLZI;
                            if (c77557UcD4 != null) {
                                T2J.LJIIIIZZ(c77557UcD4, j, x, y, bindingAdapterPosition, true, new AObjectS88S0101000_7(0, aqS166S0100000_16, 1), aqS166S0100000_16);
                                C0NB.LJIIIZ("GiftPanelCombo", "showCombo $comboView");
                            }
                        }
                    }
                    X();
                    this.LJLLL = true;
                }
            }
        }
    }

    public final void f0(int i, int i2) {
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

    public void L(AbstractC32698CsQ<?> abstractC32698CsQ, DataChannel dataChannel, int i) {
        GiftLockInfo giftLockInfo;
        long j;
        C32470Cok c32470Cok;
        FreqLimitGiftOption freqLimitOption;
        int intValue;
        Room room;
        Gift gift;
        Gift gift2;
        GiftLockInfo giftLockInfo2;
        InterfaceC136265Wk interfaceC136265Wk;
        Gift gift3;
        GiftLockInfo giftLockInfo3;
        Gift gift4;
        this.LJLJLJ = abstractC32698CsQ;
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setText(abstractC32698CsQ.LJFF());
            C29306Beo.LJJLJLI(c47121t6);
        }
        C47061t0 c47061t0 = this.LJLJJL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        View view = this.LJLLI;
        if (view != null) {
            view.setVisibility(4);
        }
        C47121t6 c47121t62 = this.LJLLJ;
        if (c47121t62 != null) {
            c47121t62.setVisibility(0);
        }
        T t = abstractC32698CsQ.LIZIZ;
        AbstractC32698CsQ<?> abstractC32698CsQ2 = null;
        if ((t instanceof Gift) && (gift4 = (Gift) t) != null) {
            giftLockInfo = gift4.giftSubInfo;
        } else {
            giftLockInfo = null;
        }
        if (giftLockInfo != null && ((abstractC32698CsQ.LJII() || abstractC32698CsQ.LJIIIZ()) && (gift3 = (Gift) abstractC32698CsQ.LIZIZ) != null && (giftLockInfo3 = gift3.giftSubInfo) != null && giftLockInfo3.mLock)) {
            LiveIconView liveIconView = this.LJLLLLLL;
            if (liveIconView != null) {
                liveIconView.setVisibility(0);
            }
        } else {
            LiveIconView liveIconView2 = this.LJLLLLLL;
            if (liveIconView2 != null) {
                liveIconView2.setVisibility(8);
            }
        }
        InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
        if (interfaceC32671Crz != null) {
            abstractC32698CsQ2 = ((AbstractC32682CsA) interfaceC32671Crz).LJLIL;
        }
        if (abstractC32698CsQ2 == this.LJLJLJ) {
            View view2 = this.LJLLI;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            InterfaceC32671Crz interfaceC32671Crz2 = this.LJLJLLL;
            if (interfaceC32671Crz2 != null && (interfaceC136265Wk = ((AbstractC32682CsA) interfaceC32671Crz2).LJLJJL) != null && ((LiveNewGiftPanelWidget) interfaceC136265Wk).LJLZ()) {
                C47121t6 c47121t63 = this.LJLZ;
                if (c47121t63 != null) {
                    c47121t63.setVisibility(0);
                }
                LiveIconView liveIconView3 = this.LJLLLLLL;
                if (liveIconView3 != null) {
                    liveIconView3.setVisibility(8);
                }
                C47121t6 c47121t64 = this.LJLLILLLL;
                if (c47121t64 != null) {
                    c47121t64.setVisibility(4);
                }
                C47121t6 c47121t65 = this.LJLLJ;
                if (c47121t65 != null) {
                    c47121t65.setVisibility(4);
                }
            } else if (C32833Cub.LIZLLL == EnumC35442Dva.ItemCountdown) {
                C47121t6 c47121t66 = this.LJLLILLLL;
                if (c47121t66 != null) {
                    c47121t66.setVisibility(0);
                }
                C47121t6 c47121t67 = this.LJLLJ;
                if (c47121t67 != null) {
                    c47121t67.setVisibility(4);
                }
                C47121t6 c47121t68 = this.LJLZ;
                if (c47121t68 != null) {
                    c47121t68.setVisibility(4);
                }
            } else {
                T t2 = abstractC32698CsQ.LIZIZ;
                if (((t2 instanceof Gift) && (gift = (Gift) t2) != null && gift.giftSubInfo != null && (t2 instanceof Gift) && (gift2 = (Gift) t2) != null && (giftLockInfo2 = gift2.giftSubInfo) != null && giftLockInfo2.mLock) || Y()) {
                    C47121t6 c47121t69 = this.LJLZ;
                    if (c47121t69 != null) {
                        c47121t69.setVisibility(0);
                    }
                    LiveIconView liveIconView4 = this.LJLLLLLL;
                    if (liveIconView4 != null) {
                        liveIconView4.setVisibility(8);
                    }
                    C47121t6 c47121t610 = this.LJLLILLLL;
                    if (c47121t610 != null) {
                        c47121t610.setVisibility(4);
                    }
                    C47121t6 c47121t611 = this.LJLLJ;
                    if (c47121t611 != null) {
                        c47121t611.setVisibility(4);
                    }
                } else {
                    C47121t6 c47121t612 = this.LJLLJ;
                    if (c47121t612 != null) {
                        c47121t612.setVisibility(0);
                    }
                    C47121t6 c47121t613 = this.LJLZ;
                    if (c47121t613 != null) {
                        c47121t613.setVisibility(4);
                    }
                    C47121t6 c47121t614 = this.LJLLILLLL;
                    if (c47121t614 != null) {
                        c47121t614.setVisibility(4);
                    }
                }
            }
            C47121t6 c47121t615 = this.LJLJJI;
            if (c47121t615 != null) {
                c47121t615.setVisibility(8);
            }
            InterfaceC32671Crz interfaceC32671Crz3 = this.LJLJLLL;
            if (interfaceC32671Crz3 != null) {
                ((AbstractC32682CsA) interfaceC32671Crz3).LJLILLLLZI = this;
            }
        }
        this.LJZ.LIZLLL();
        this.LJLLLL = i;
        Q();
        P();
        long LIZJ = abstractC32698CsQ.LIZJ();
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        HashMap<Long, C32470Cok> hashMap = GiftManager.inst().freqLimitInfoList;
        if (hashMap == null || (c32470Cok = hashMap.get(Long.valueOf(LIZJ))) == null || (freqLimitOption = GiftManager.inst().getFreqLimitOption(Long.valueOf(LIZJ))) == null) {
            return;
        }
        if (c32470Cok.LIZIZ) {
            Integer num = (Integer) ((LinkedHashMap) c32470Cok.LIZJ).get(Long.valueOf(j));
            if (num != null) {
                intValue = num.intValue();
                if (intValue <= 0 || freqLimitOption.refreshTimeStamp <= System.currentTimeMillis() / 1000) {
                }
                C47121t6 c47121t616 = this.LJLLJ;
                if (c47121t616 != null) {
                    c47121t616.setBackgroundResource(R.drawable.d3a);
                }
                C47121t6 c47121t617 = this.LJLLJ;
                if (c47121t617 == null) {
                    return;
                }
                c47121t617.setTextColor(ColorProtector.parseColor("#57ffffff"));
                return;
            }
        }
        intValue = c32470Cok.LIZ;
        if (intValue <= 0) {
        }
    }
}
