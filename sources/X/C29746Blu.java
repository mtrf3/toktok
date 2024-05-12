package X;

import Y.ALAdapterS3S0300000_5;
import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import Y.IDAListenerS39S0200000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubLottieConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSaveClickTimesSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubWebpOriginalPlaySettings;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.livesetting.level.FansTaskInitialDataExperiment;
import com.bytedance.android.livesdk.livesetting.level.LiveFansLastClickDefaultValueSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import q03.IDaS485S0100000_5;

/* renamed from: X.Blu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29746Blu extends C29740Blo {
    public final ViewGroup LJIIIZ;
    public final ViewGroup LJIIJ;
    public final InterfaceC29736Blk LJIIJJI;
    public final LifecycleOwner LJIIL;
    public final DataChannel LJIILIIL;
    public final ConstraintLayout LJIILJJIL;
    public final C47061t0 LJIILL;
    public final FrameLayout LJIILLIIL;
    public final C31165CKz LJIIZILJ;
    public final C31165CKz LJIJ;
    public final C2A4 LJIJI;
    public final ImageView LJIJJ;
    public final C29701Eo LJIJJLI;
    public final C47121t6 LJIL;
    public final ImageView LJJ;
    public final C31165CKz LJJI;
    public final C29701Eo LJJIFFI;
    public final C29701Eo LJJII;
    public AnimatorSet LJJIII;
    public final C73318Sq2 LJJIIJ;
    public boolean LJJIIJZLJL;
    public final C29758Bm6 LJJIIZ;
    public C15540jG LJJIIZI;
    public final C29747Blv LJJIJ;

    @Override // X.InterfaceC29734Bli
    public final void onRelease() {
        ViewGroup.LayoutParams layoutParams;
        this.LIZLLL = null;
        this.LJJIIJZLJL = false;
        C29701Eo c29701Eo = this.LJIJJLI;
        if (c29701Eo != null && c29701Eo.isAnimating()) {
            C29701Eo c29701Eo2 = this.LJIJJLI;
            if (c29701Eo2 != null) {
                c29701Eo2.cancelAnimation();
            }
            C29701Eo c29701Eo3 = this.LJIJJLI;
            if (c29701Eo3 != null) {
                c29701Eo3.removeAllAnimatorListeners();
            }
        }
        C29701Eo c29701Eo4 = this.LJJIFFI;
        if (c29701Eo4 != null && c29701Eo4.isAnimating()) {
            C29701Eo c29701Eo5 = this.LJJIFFI;
            if (c29701Eo5 != null) {
                c29701Eo5.cancelAnimation();
            }
            C29701Eo c29701Eo6 = this.LJJIFFI;
            if (c29701Eo6 != null) {
                c29701Eo6.removeAllAnimatorListeners();
            }
        }
        C29701Eo c29701Eo7 = this.LJJII;
        if (c29701Eo7 != null && c29701Eo7.isAnimating()) {
            C29701Eo c29701Eo8 = this.LJJII;
            if (c29701Eo8 != null) {
                c29701Eo8.cancelAnimation();
            }
            C29701Eo c29701Eo9 = this.LJJII;
            if (c29701Eo9 != null) {
                c29701Eo9.removeAllAnimatorListeners();
            }
        }
        AnimatorSet animatorSet = this.LJJIII;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJJIII;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.LJJIII;
            if (animatorSet3 != null) {
                C16880lQ.LJLJJL(animatorSet3);
            }
        }
        KL2.LJIILLIIL(8, this.LJIL);
        KL2.LJIILLIIL(8, this.LJIJI);
        KL2.LJIILLIIL(8, this.LJJI);
        KL2.LJIILLIIL(8, this.LJJIFFI);
        KL2.LJIILLIIL(8, this.LJJII);
        KL2.LJIILLIIL(8, this.LJIJJLI);
        KL2.LJIILLIIL(8, this.LJIJ);
        C47121t6 c47121t6 = this.LJIL;
        if (c47121t6 != null && (layoutParams = c47121t6.getLayoutParams()) != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            C47121t6 c47121t62 = this.LJIL;
            if (c47121t62 != null) {
                c47121t62.setLayoutParams(layoutParams);
            }
        }
        LJIIZILJ(this.LJIILL);
        LJIIZILJ(this.LJIJJ);
        LJIIZILJ(this.LJIILL);
        LJIIZILJ(this.LJIL);
        LJIIZILJ(this.LJIIZILJ);
        LJIIZILJ(this.LJJI);
        C31165CKz c31165CKz = this.LJIIZILJ;
        if (c31165CKz != null) {
            c31165CKz.setTranslationY(0.0f);
        }
        C31165CKz c31165CKz2 = this.LJIJ;
        if (c31165CKz2 != null) {
            c31165CKz2.setTranslationY(0.0f);
        }
        C31165CKz c31165CKz3 = this.LJJI;
        if (c31165CKz3 != null) {
            c31165CKz3.setTranslationY(0.0f);
        }
        LJIIJJI();
        C15540jG c15540jG = this.LJJIIZI;
        if (c15540jG != null) {
            c15540jG.LIZ();
        }
        this.LIZLLL = null;
        this.LJII = false;
        try {
            LiveDialogFragment liveDialogFragment = this.LJI;
            if (liveDialogFragment != null) {
                liveDialogFragment.dismiss();
            }
            this.LJI = null;
        } catch (Throwable unused) {
        }
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.C29740Blo
    public final void LIZ() {
        DataChannel dataChannel = this.LJIILIIL;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJIIL, FansClubEvent.class, new AqS171S0100000_5(this, 794));
        }
    }

    public final void LIZLLL() {
        AnimatorSet animatorSet = this.LJJIII;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        this.LJJIII = new AnimatorSet();
    }

    @Override // X.InterfaceC29734Bli
    public final void LJFF() {
        KL2.LJIILLIIL(8, this.LJIILLIIL);
        KL2.LJIILLIIL(4, this.LJIJJ);
        KL2.LJIILLIIL(4, this.LJIILL);
        C47061t0 c47061t0 = this.LJIILL;
        if (c47061t0 != null) {
            c47061t0.setImageResource(R.drawable.cuu);
        }
        ImageView imageView = this.LJIJJ;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ctj);
        }
    }

    @Override // X.C29740Blo, X.InterfaceC29734Bli
    public final boolean LJIIIIZZ() {
        C29750Bly c29750Bly = this.LIZLLL;
        if (c29750Bly != null && c29750Bly.LIZ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC29734Bli
    public final void LJIIJ() {
        KL2.LJIILLIIL(8, this.LJIILLIIL);
        KL2.LJIILLIIL(0, this.LJIJJ);
        KL2.LJIILLIIL(0, this.LJIILL);
    }

    public final void LJIIJJI() {
        KL2.LJIILLIIL(8, this.LJJ);
        ImageView imageView = this.LJJ;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        ImageView imageView2 = this.LJJ;
        if (imageView2 == null) {
            return;
        }
        imageView2.setAlpha(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL() {
        double d;
        int i;
        int i2;
        View view;
        ViewGroup viewGroup;
        DataChannel dataChannel = this.LJIILIIL;
        if (dataChannel != null && o.LJ(dataChannel.kv0(C29722BlW.class), Boolean.TRUE)) {
            this.LJJIIJZLJL = false;
            return;
        }
        if (this.LJIIJJI == null) {
            return;
        }
        this.LJJIIJZLJL = true;
        C30554Byw<Double> c30554Byw = InterfaceC30442Bx8.m2;
        Double LIZ = c30554Byw.LIZ();
        if (LIZ != null) {
            d = LIZ.doubleValue();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        c30554Byw.LIZJ(Double.valueOf(((int) d) + 1));
        ((C29727Blb) this.LJIIJJI).LIZJ();
        KL2.LJIILLIIL(4, this.LJIL);
        C47121t6 c47121t6 = this.LJIL;
        if (c47121t6 != null) {
            c47121t6.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        C47121t6 c47121t62 = this.LJIL;
        if (c47121t62 != null) {
            i = c47121t62.getMeasuredWidth();
        } else {
            i = 0;
        }
        InterfaceC29736Blk interfaceC29736Blk = this.LJIIJJI;
        if (interfaceC29736Blk != null && (viewGroup = ((C29727Blb) interfaceC29736Blk).LIZLLL) != null) {
            i2 = viewGroup.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        if (i2 > i) {
            i2 = i;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS94S0100000_5(this, 60));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((C29727Blb) this.LJIIJJI).LIZ, (Property<View, Float>) View.ALPHA, 1.0f, 0.2f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJIJJ, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJIL, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat4.setDuration(200L);
        ofFloat4.setStartDelay(100L);
        ofFloat4.addListener(new ALAdapterS4S0100000_5(this, 65));
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJIL, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setDuration(200L);
        ofFloat5.setStartDelay(3000L);
        ofFloat5.addListener(new ALAdapterS4S0100000_5(this, 66));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat6.setDuration(200L);
        ofFloat6.setStartDelay(3200L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.LJIJJ, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat7.setDuration(200L);
        ofFloat7.setStartDelay(3200L);
        OSZ LIZ2 = C116784iA.LIZ(this.LJIJJ, 200L, 3300L, 0.0f, 1.0f);
        InterfaceC29736Blk interfaceC29736Blk2 = this.LJIIJJI;
        if (interfaceC29736Blk2 != null) {
            view = ((C29727Blb) interfaceC29736Blk2).LIZ;
        } else {
            view = null;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.2f, 1.0f);
        ofFloat8.setDuration(200L);
        ofFloat8.setStartDelay(3200L);
        LIZLLL();
        AnimatorSet animatorSet = this.LJJIII;
        if (animatorSet != null) {
            animatorSet.playTogether(ofInt, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, LIZ2.getFirst(), LIZ2.getSecond(), ofFloat8);
        }
        AnimatorSet animatorSet2 = this.LJJIII;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public final void LJIJ() {
        KL2.LJIILLIIL(8, this.LJIILLIIL);
        KL2.LJIILLIIL(0, this.LJIJJ);
        C47061t0 c47061t0 = this.LJIILL;
        if (c47061t0 != null) {
            c47061t0.setImageResource(R.drawable.cuu);
        }
        ImageView imageView = this.LJIJJ;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ctj);
        }
    }

    @Override // X.InterfaceC29734Bli
    public final View LJI() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC29734Bli
    public final View LJIIIZ() {
        return this.LJIJJ;
    }

    public static void LJIIZILJ(View view) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    @Override // X.InterfaceC29734Bli
    public final void LJII(Object obj) {
        EnumC29732Blg enumC29732Blg;
        double d;
        boolean z;
        if (obj instanceof EnumC29732Blg) {
            enumC29732Blg = (EnumC29732Blg) obj;
        } else {
            enumC29732Blg = null;
        }
        LJIJJ(enumC29732Blg);
        if (enumC29732Blg == null) {
            return;
        }
        int i = C29748Blw.LIZ[enumC29732Blg.ordinal()];
        boolean z2 = true;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    } else {
                        LJIJJLI(this.LIZLLL);
                    }
                } else {
                    this.LJJIIJZLJL = false;
                    LJIJ();
                    EnumC29752Bm0 enumC29752Bm0 = EnumC29752Bm0.FANS_CLUB_ANIM_PLUS_TO_ONE_TYPE;
                    C29750Bly c29750Bly = this.LIZLLL;
                    LJIJI(enumC29752Bm0, c29750Bly, c29750Bly, 0L, false);
                }
            } else {
                LJIJ();
            }
        } else {
            LJIJ();
            this.LJJIIJZLJL = false;
            try {
                if (!C259710f.LIZ.LJIIIZ()) {
                    Double LIZ = InterfaceC30442Bx8.m2.LIZ();
                    if (LIZ != null) {
                        d = LIZ.doubleValue();
                    } else {
                        d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    if (((int) d) <= 2) {
                        this.LJII = true;
                        EnumC29752Bm0 enumC29752Bm02 = EnumC29752Bm0.FANS_CLUB_ANIM_UNJOIN_ENHANCE_GUIDE_TYPE;
                        C29750Bly c29750Bly2 = this.LIZLLL;
                        if (enumC29732Blg == EnumC29732Blg.FANS_CLUB_UNJOIN_DELAY_ANIM) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LJIJI(enumC29752Bm02, c29750Bly2, c29750Bly2, 0L, z);
                    }
                }
            } catch (Exception unused) {
            }
        }
        InterfaceC29736Blk interfaceC29736Blk = this.LJIIJJI;
        if (interfaceC29736Blk == null || !((C29727Blb) interfaceC29736Blk).LJIIIZ()) {
            z2 = false;
        }
        LIZJ("user", z2, false, this.LJII);
    }

    public final void LJIILIIL(long j) {
        long j2;
        boolean z;
        Context context;
        Room room;
        DataChannel dataChannel = this.LJIILIIL;
        long j3 = 0;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        C30554Byw<java.util.Map<String, String>> c30554Byw = InterfaceC30442Bx8.o2;
        java.util.Map<String, String> LIZ = c30554Byw.LIZ();
        if (!LiveFansLastClickDefaultValueSwitchSetting.INSTANCE.getValue()) {
            j3 = j;
        }
        int i = 0;
        if (LIZ != null && LIZ.containsKey(String.valueOf(j2))) {
            String str = LIZ.get(String.valueOf(j2));
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            j3 = C1E4.LJJII(str);
        }
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService != null) {
            z = iFansClubService.As0((int) j3, (int) j);
        } else {
            z = false;
        }
        if (j <= 1 || !z) {
            if (FansTaskInitialDataExperiment.INSTANCE.isDefaultGroup()) {
                LJIIL(j3, j, "roma_schema_page_user_main");
            } else {
                ViewGroup viewGroup = this.LJIIJ;
                if (viewGroup != null && (context = viewGroup.getContext()) != null) {
                    ((IFansClubService) CN1.LIZ(IFansClubService.class)).ED(context, "entrance");
                }
            }
        } else {
            LJIIL(j3, j, "roma_schema_page_user_upgrade");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LIZ != null) {
            i = LIZ.size();
        }
        if (i < FansClubSaveClickTimesSettings.INSTANCE.getValue() && LIZ != null) {
            linkedHashMap.putAll(LIZ);
        }
        linkedHashMap.put(String.valueOf(j2), String.valueOf(j));
        c30554Byw.LIZJ(linkedHashMap);
    }

    public final void LJIJJ(EnumC29732Blg enumC29732Blg) {
        InterfaceC29736Blk interfaceC29736Blk = this.LJIIJJI;
        if (interfaceC29736Blk != null) {
            C29727Blb c29727Blb = (C29727Blb) interfaceC29736Blk;
            if (enumC29732Blg instanceof EnumC29732Blg) {
                c29727Blb.LJIIL = enumC29732Blg;
            }
        }
        this.LIZJ = enumC29732Blg;
    }

    public final void LJIJJLI(C29750Bly c29750Bly) {
        if (c29750Bly != null) {
            ImageView imageView = this.LJIJJ;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            ImageView imageView2 = this.LJIJJ;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.LJIJJ;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
            KL2.LJIILLIIL(8, this.LJIJJ);
            KL2.LJIILLIIL(0, this.LJIILLIIL);
            KL2.LJIILLIIL(0, this.LJIILL);
            KL2.LJIILLIIL(0, this.LJIIZILJ);
            C31165CKz c31165CKz = this.LJIIZILJ;
            if (c31165CKz != null) {
                c31165CKz.setText(String.valueOf(c29750Bly.LIZ));
            }
            C31165CKz c31165CKz2 = this.LJIIZILJ;
            if (c31165CKz2 != null) {
                c31165CKz2.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
            }
            C31165CKz c31165CKz3 = this.LJIIZILJ;
            if (c31165CKz3 != null) {
                String str = c29750Bly.LJI;
                if (str == null) {
                    str = "#FFFFA25F";
                }
                c31165CKz3.setTextColor(C15380j0.LIZJ(0, str));
            }
            C15650jR.LIZ().LJIIIZ(c29750Bly.LIZJ).LJIIJJI(this.LJIILL);
        }
    }

    public final void LJIL(boolean z) {
        ViewParent viewParent;
        ViewParent viewParent2;
        ViewGroup viewGroup;
        ViewParent parent;
        ViewParent parent2;
        ViewGroup viewGroup2;
        ViewParent parent3;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4 = this.LJIIJ;
        if (viewGroup4 != null && z != viewGroup4.getClipChildren()) {
            viewGroup4.setClipChildren(z);
        }
        ViewGroup viewGroup5 = this.LJIIJ;
        ViewParent viewParent3 = null;
        if (viewGroup5 != null) {
            viewParent = viewGroup5.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) viewParent) != null && z != viewGroup3.getClipChildren()) {
            viewGroup3.setClipChildren(z);
        }
        ViewGroup viewGroup6 = this.LJIIJ;
        if (viewGroup6 != null && (parent3 = viewGroup6.getParent()) != null) {
            viewParent2 = parent3.getParent();
        } else {
            viewParent2 = null;
        }
        if ((viewParent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewParent2) != null && z != viewGroup2.getClipChildren()) {
            viewGroup2.setClipChildren(z);
        }
        ViewGroup viewGroup7 = this.LJIIJ;
        if (viewGroup7 != null && (parent = viewGroup7.getParent()) != null && (parent2 = parent.getParent()) != null) {
            viewParent3 = parent2.getParent();
        }
        if ((viewParent3 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent3) != null && z != viewGroup.getClipChildren()) {
            viewGroup.setClipChildren(z);
        }
    }

    public final void LJIILL(boolean z, C29747Blv c29747Blv) {
        FansClubConfig fansClubConfig;
        FansClubLottieConfig fansClubLottieConfig;
        FansClubSettings fansClubSettings = FansClubSettings.INSTANCE;
        if (fansClubSettings != null && (fansClubConfig = fansClubSettings.getFansClubConfig()) != null && (fansClubLottieConfig = fansClubConfig.fansClubLottieConfig) != null) {
            IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
            String str = "";
            if (iHostResource != null) {
                String str2 = fansClubLottieConfig.lottieChannel;
                if (str2 == null) {
                    str2 = "";
                }
                if (iHostResource.Br0(str2) && !TextUtils.isEmpty(fansClubLottieConfig.weakGuideLottieName)) {
                    KL2.LJIILLIIL(0, this.LJIJJLI);
                    C29701Eo c29701Eo = this.LJIJJLI;
                    if (c29701Eo != null) {
                        c29701Eo.removeAllAnimatorListeners();
                    }
                    C29701Eo c29701Eo2 = this.LJIJJLI;
                    if (c29701Eo2 != null) {
                        c29701Eo2.addAnimatorListener(new C29753Bm1(this, z, c29747Blv));
                    }
                    C29701Eo c29701Eo3 = this.LJIJJLI;
                    String str3 = fansClubLottieConfig.lottieChannel;
                    if (str3 != null) {
                        str = str3;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    C15490jB.LJIIL(c29701Eo3, str, JBR.LJFF(LIZ, fansClubLottieConfig.weakGuideLottieName, ".zip", LIZ), "", true, null, null, 64);
                    return;
                }
            }
        }
        KL2.LJIILLIIL(8, this.LJIJJLI);
        if (z) {
            LJII(EnumC29732Blg.FANS_CLUB_UNJOIN);
        }
        if (c29747Blv == null) {
            return;
        }
        c29747Blv.LIZ();
    }

    public final void LJIILLIIL(String str, String str2) {
        KL2.LJIILLIIL(0, this.LJJII);
        C29701Eo c29701Eo = this.LJJII;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo2 = this.LJJII;
        if (c29701Eo2 != null) {
            c29701Eo2.addAnimatorListener(new IDAListenerS39S0200000_5(this, 1));
        }
        C15490jB.LJIIL(this.LJJII, str2, i0.LJFF(str, ".zip"), "", true, null, null, 64);
    }

    public final void LJIIL(long j, long j2, String str) {
        Context context;
        C32364Cn2 c32364Cn2 = new C32364Cn2("aweme://roma_redirect/?");
        c32364Cn2.LIZIZ(j, "from_grade");
        c32364Cn2.LIZIZ(j2, "to_grade");
        c32364Cn2.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c32364Cn2.LIZJ("roma_page_key", str);
        c32364Cn2.LIZJ("show_entrance", "entrance");
        ViewGroup viewGroup = this.LJIIJ;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(c32364Cn2.LIZLLL()));
        }
    }

    public C29746Blu(ViewGroup rootView, ViewGroup viewGroup, InterfaceC29736Blk interfaceC29736Blk, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        ConstraintLayout constraintLayout;
        C47061t0 c47061t0;
        FrameLayout frameLayout;
        C31165CKz c31165CKz;
        C31165CKz c31165CKz2;
        C2A4 c2a4;
        ImageView imageView;
        C29701Eo c29701Eo;
        C47121t6 c47121t6;
        C31165CKz c31165CKz3;
        C29701Eo c29701Eo2;
        C29701Eo c29701Eo3;
        ImageView imageView2;
        Room room;
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIIIZ = rootView;
        this.LJIIJ = viewGroup;
        this.LJIIJJI = interfaceC29736Blk;
        this.LJIIL = lifecycleOwner;
        this.LJIILIIL = dataChannel;
        this.LJJIIJ = new C73318Sq2();
        this.LJJIIZ = new C29758Bm6();
        this.LJJIJ = new C29747Blv(this);
        this.LIZ = false;
        if (viewGroup != null) {
            constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.bct);
        } else {
            constraintLayout = null;
        }
        this.LJIILJJIL = constraintLayout;
        if (viewGroup != null) {
            c47061t0 = (C47061t0) viewGroup.findViewById(R.id.f31);
        } else {
            c47061t0 = null;
        }
        this.LJIILL = c47061t0;
        if (viewGroup != null) {
            frameLayout = (FrameLayout) viewGroup.findViewById(R.id.ddy);
        } else {
            frameLayout = null;
        }
        this.LJIILLIIL = frameLayout;
        if (viewGroup != null) {
            c31165CKz = (C31165CKz) viewGroup.findViewById(R.id.m6m);
        } else {
            c31165CKz = null;
        }
        this.LJIIZILJ = c31165CKz;
        if (viewGroup != null) {
            c31165CKz2 = (C31165CKz) viewGroup.findViewById(R.id.m6j);
        } else {
            c31165CKz2 = null;
        }
        this.LJIJ = c31165CKz2;
        if (viewGroup != null) {
            c2a4 = (C2A4) viewGroup.findViewById(R.id.d4r);
        } else {
            c2a4 = null;
        }
        this.LJIJI = c2a4;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.f32);
        } else {
            imageView = null;
        }
        this.LJIJJ = imageView;
        if (viewGroup != null) {
            c29701Eo = (C29701Eo) viewGroup.findViewById(R.id.f30);
        } else {
            c29701Eo = null;
        }
        this.LJIJJLI = c29701Eo;
        if (viewGroup != null) {
            c47121t6 = (C47121t6) viewGroup.findViewById(R.id.m6l);
        } else {
            c47121t6 = null;
        }
        this.LJIL = c47121t6;
        if (viewGroup != null) {
            c31165CKz3 = (C31165CKz) viewGroup.findViewById(R.id.mmz);
        } else {
            c31165CKz3 = null;
        }
        this.LJJI = c31165CKz3;
        if (viewGroup != null) {
            c29701Eo2 = (C29701Eo) viewGroup.findViewById(R.id.exm);
        } else {
            c29701Eo2 = null;
        }
        this.LJJIFFI = c29701Eo2;
        if (viewGroup != null) {
            c29701Eo3 = (C29701Eo) viewGroup.findViewById(R.id.fb2);
        } else {
            c29701Eo3 = null;
        }
        this.LJJII = c29701Eo3;
        if (interfaceC29736Blk != null) {
            imageView2 = ((C29727Blb) interfaceC29736Blk).LJJII;
        } else {
            imageView2 = null;
        }
        this.LJJ = imageView2;
        if (interfaceC29736Blk != null && c47121t6 != null) {
            c47121t6.setBackgroundResource(R.drawable.chr);
        }
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
            this.LIZLLL = iFansClubService != null ? iFansClubService.yD(room.getOwner()) : null;
        }
        if (viewGroup != null) {
            C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 6), viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig] */
    public final void LJIJI(EnumC29752Bm0 enumC29752Bm0, C29750Bly c29750Bly, C29750Bly c29750Bly2, long j, boolean z) {
        long j2;
        FansEntranceResConfig fansEntranceResConfig;
        FansClubConfig fansClubConfig;
        FansClubLottieConfig fansClubLottieConfig;
        IHostResource iHostResource;
        IHostResource iHostResource2;
        ?? sx;
        IHostResource iHostResource3;
        FansEntranceResConfig sx2;
        boolean z2;
        C2A4 c2a4;
        int i;
        ViewParent viewParent;
        boolean z3;
        Object obj;
        ViewGroup viewGroup;
        if (this.LJJIIJZLJL) {
            this.LJJIIZ.LIZ.add(new C29749Blx(enumC29752Bm0, c29750Bly2, j));
            return;
        }
        switch (C29748Blw.LIZIZ[enumC29752Bm0.ordinal()]) {
            case 1:
                this.LJJIIJZLJL = true;
                LJIJ();
                OSZ LIZ = C116784iA.LIZ(this.LJIILL, 300L, 0L, 1.0f, 0.6f);
                OSZ LIZ2 = C116784iA.LIZ(this.LJIJJ, 300L, 0L, 1.0f, 0.6f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJIJJ, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat2.setDuration(300L);
                ofFloat2.addListener(new ALAdapterS4S0200000_5(c29750Bly2, this, 20));
                OSZ LIZ3 = C116784iA.LIZ(this.LJIILL, 200L, 300L, 0.3f, 1.1f);
                OSZ LIZ4 = C116784iA.LIZ(this.LJIIZILJ, 200L, 300L, 0.3f, 1.1f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat3.setDuration(200L);
                ofFloat3.setStartDelay(300L);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat4.setDuration(200L);
                ofFloat4.setStartDelay(300L);
                OSZ LIZ5 = C116784iA.LIZ(this.LJIILL, 100L, 500L, 1.1f, 1.0f);
                OSZ LIZ6 = C116784iA.LIZ(this.LJIIZILJ, 100L, 500L, 1.1f, 1.0f);
                LIZLLL();
                AnimatorSet animatorSet = this.LJJIII;
                if (animatorSet != null) {
                    animatorSet.playTogether(LIZ.getFirst(), LIZ.getSecond(), LIZ2.getFirst(), LIZ2.getSecond(), ofFloat, ofFloat2, LIZ3.getFirst(), LIZ3.getSecond(), LIZ4.getFirst(), LIZ4.getSecond(), ofFloat3, ofFloat4, LIZ5.getFirst(), LIZ5.getSecond(), LIZ6.getFirst(), LIZ6.getSecond());
                }
                AnimatorSet animatorSet2 = this.LJJIII;
                if (animatorSet2 == null) {
                    return;
                }
                animatorSet2.start();
                return;
            case 2:
                ViewGroup viewGroup2 = null;
                if (c29750Bly == null || c29750Bly2 == null) {
                    return;
                }
                this.LJJIIJZLJL = true;
                KL2.LJIILLIIL(8, this.LJIJJ);
                KL2.LJIILLIIL(0, this.LJIILLIIL);
                KL2.LJIILLIIL(4, this.LJIIZILJ);
                KL2.LJIILLIIL(0, this.LJIJ);
                C31165CKz c31165CKz = this.LJIIZILJ;
                if (c31165CKz != null) {
                    c31165CKz.setText(String.valueOf(c29750Bly2.LIZ));
                }
                C31165CKz c31165CKz2 = this.LJIIZILJ;
                if (c31165CKz2 != null) {
                    c31165CKz2.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
                }
                C31165CKz c31165CKz3 = this.LJIIZILJ;
                if (c31165CKz3 != null) {
                    c31165CKz3.setTextColor(C15380j0.LIZJ(0, c29750Bly2.LJI));
                }
                C15650jR.LIZ().LJIIIZ(c29750Bly2.LIZJ).LJIIJJI(this.LJIILL);
                boolean z4 = C29771BmJ.LJII;
                int i2 = (int) c29750Bly.LIZ;
                C29474BhW.LJ(i2, i2, "fans_club_entrance_icon", z4);
                C31165CKz c31165CKz4 = this.LJIIZILJ;
                if (c31165CKz4 != null) {
                    i = c31165CKz4.getMeasuredHeight();
                } else {
                    i = 2;
                }
                int i3 = i - 2;
                C31165CKz c31165CKz5 = this.LJIJ;
                if (c31165CKz5 != null) {
                    c31165CKz5.setText(String.valueOf(c29750Bly.LIZ));
                }
                C31165CKz c31165CKz6 = this.LJIJ;
                if (c31165CKz6 != null) {
                    c31165CKz6.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
                }
                C31165CKz c31165CKz7 = this.LJIJ;
                if (c31165CKz7 != null) {
                    c31165CKz7.setTextColor(C15380j0.LIZJ(0, c29750Bly2.LJI));
                }
                float f = i3;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJIJ, (Property<C31165CKz, Float>) View.TRANSLATION_Y, 0.0f, -f);
                ofFloat5.setDuration(500L);
                ConstraintLayout constraintLayout = this.LJIILJJIL;
                if (constraintLayout != null) {
                    constraintLayout.setClipChildren(true);
                }
                ViewGroup viewGroup3 = this.LJIIJ;
                if (viewGroup3 != null) {
                    viewParent = viewGroup3.getParent();
                } else {
                    viewParent = null;
                }
                if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                    z3 = viewGroup.getClipChildren();
                } else {
                    z3 = true;
                }
                ViewGroup viewGroup4 = this.LJIIJ;
                if (viewGroup4 != null) {
                    obj = viewGroup4.getParent();
                } else {
                    obj = null;
                }
                if (obj instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) obj;
                }
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(true);
                }
                ofFloat5.addListener(new C29751Blz(this, z3));
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.TRANSLATION_Y, f, 0.0f);
                ofFloat6.setDuration(500L);
                ofFloat6.addListener(new ALAdapterS4S0200000_5(c29750Bly2, this, 21));
                LIZLLL();
                AnimatorSet animatorSet3 = this.LJJIII;
                if (animatorSet3 != null) {
                    animatorSet3.playTogether(ofFloat5, ofFloat6);
                }
                AnimatorSet animatorSet4 = this.LJJIII;
                if (animatorSet4 == null) {
                    return;
                }
                animatorSet4.start();
                return;
            case 3:
                if (c29750Bly == null || c29750Bly2 == null) {
                    return;
                }
                this.LJJIIJZLJL = true;
                LJIIJJI();
                KL2.LJIILLIIL(4, this.LJJ);
                KL2.LJIILLIIL(0, this.LJIJI);
                KL2.LJIILLIIL(0, this.LJIILL);
                KL2.LJIILLIIL(0, this.LJIIZILJ);
                KL2.LJIILLIIL(0, this.LJIILLIIL);
                KL2.LJIILLIIL(8, this.LJIJJ);
                C34K c34k = new C34K();
                IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
                if (iFansClubService != null && (sx2 = iFansClubService.sx((int) c29750Bly2.LIZ)) != null) {
                    IHostResource iHostResource4 = (IHostResource) CN1.LIZ(IHostResource.class);
                    if (iHostResource4 != null) {
                        z2 = iHostResource4.Br0(sx2.geckoChannel);
                    } else {
                        z2 = false;
                    }
                    c34k.element = z2;
                    if (z2 && !TextUtils.isEmpty(sx2.geckoChannel) && !TextUtils.isEmpty(sx2.entranceAnimFileName)) {
                        String channel = sx2.geckoChannel;
                        String fileName = sx2.entranceAnimFileName;
                        this.LJJIIZI = null;
                        if (C15380j0.LJIIZILJ() && (c2a4 = this.LJIJI) != null) {
                            c2a4.setScaleX(-1.0f);
                        }
                        C15540jG c15540jG = new C15540jG();
                        c15540jG.LJIILIIL = true;
                        C2A4 c2a42 = this.LJIJI;
                        o.LJII(c2a42, "null cannot be cast to non-null type com.bytedance.android.live.core.widget.HSImageView");
                        c15540jG.LIZ = c2a42;
                        o.LJIIIZ(channel, "channel");
                        c15540jG.LIZIZ = channel;
                        o.LJIIIZ(fileName, "fileName");
                        c15540jG.LIZJ = fileName;
                        c15540jG.LJFF = true;
                        c15540jG.LJ = new C29754Bm2(this);
                        if (FansClubWebpOriginalPlaySettings.INSTANCE.getValue()) {
                            c15540jG.LJIIL = true;
                        }
                        C15490jB.LJI(c15540jG);
                        this.LJJIIZI = c15540jG;
                    }
                }
                C31165CKz c31165CKz8 = this.LJIIZILJ;
                if (c31165CKz8 != null) {
                    c31165CKz8.setText(String.valueOf(c29750Bly.LIZ));
                }
                C31165CKz c31165CKz9 = this.LJIIZILJ;
                if (c31165CKz9 != null) {
                    c31165CKz9.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
                }
                C31165CKz c31165CKz10 = this.LJIIZILJ;
                if (c31165CKz10 != null) {
                    String str = c29750Bly.LJI;
                    if (str == null) {
                        str = "#FFFFA25F";
                    }
                    c31165CKz10.setTextColor(C15380j0.LIZJ(0, str));
                }
                if (!c34k.element) {
                    OSZ LIZ7 = C116784iA.LIZ(this.LJIIZILJ, 200L, 0L, 1.0f, 0.6f);
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat7.setDuration(200L);
                    OSZ LIZ8 = C116784iA.LIZ(this.LJIILL, 200L, 0L, 1.0f, 0.6f);
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat8.setDuration(200L);
                    OSZ LIZ9 = C116784iA.LIZ(this.LJIIZILJ, 200L, 200L, 0.6f, 1.0f);
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat9.setDuration(200L);
                    ofFloat9.setStartDelay(200L);
                    ofFloat9.addListener(new ALAdapterS4S0200000_5(c29750Bly2, this, 19));
                    OSZ LIZ10 = C116784iA.LIZ(this.LJIILL, 200L, 200L, 0.6f, 1.0f);
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat10.setDuration(200L);
                    ofFloat10.setStartDelay(200L);
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.LJJ, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat11.setDuration(400L);
                    ofFloat11.setStartDelay(400L);
                    ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.LJJ, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f, -C15380j0.LJFF(R.dimen.abr));
                    ofFloat12.setDuration(400L);
                    ofFloat12.setStartDelay(400L);
                    ofFloat12.addListener(new ALAdapterS4S0100000_5(this, 69));
                    LIZLLL();
                    AnimatorSet animatorSet5 = this.LJJIII;
                    if (animatorSet5 != null) {
                        animatorSet5.playTogether(LIZ7.getFirst(), LIZ7.getSecond(), ofFloat7, LIZ8.getFirst(), LIZ8.getSecond(), ofFloat8, LIZ9.getFirst(), LIZ9.getSecond(), ofFloat9, LIZ10.getFirst(), LIZ10.getSecond(), ofFloat10, ofFloat11, ofFloat12);
                    }
                    AnimatorSet animatorSet6 = this.LJJIII;
                    if (animatorSet6 == null) {
                        return;
                    }
                    animatorSet6.start();
                    return;
                }
                OSZ LIZ11 = C116784iA.LIZ(this.LJIIZILJ, 200L, 300L, 1.0f, 0.6f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat13.setDuration(200L);
                ofFloat13.setStartDelay(300L);
                ofFloat13.addListener(new ALAdapterS3S0300000_5(c29750Bly2, this, c29750Bly, 3));
                OSZ LIZ12 = C116784iA.LIZ(this.LJIIZILJ, 300L, 3700L, 0.6f, 1.0f);
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat14.setDuration(300L);
                ofFloat14.setStartDelay(3700L);
                ofFloat14.addListener(new ALAdapterS3S0300000_5(c34k, this, c29750Bly2, 4));
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.LJJ, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat15.setDuration(300L);
                ofFloat15.setStartDelay(3700L);
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.LJJ, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f, -C15380j0.LJFF(R.dimen.abr));
                ofFloat16.setDuration(300L);
                ofFloat16.setStartDelay(3700L);
                ofFloat16.addListener(new ALAdapterS4S0100000_5(this, 67));
                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 1.0f, 1.0f);
                ofFloat17.setDuration(640L);
                ofFloat17.setStartDelay(4000L);
                ofFloat17.addListener(new ALAdapterS4S0100000_5(this, 68));
                LIZLLL();
                AnimatorSet animatorSet7 = this.LJJIII;
                if (animatorSet7 != null) {
                    animatorSet7.playTogether(LIZ11.getFirst(), LIZ11.getSecond(), ofFloat13, LIZ12.getFirst(), LIZ12.getSecond(), ofFloat14, ofFloat15, ofFloat16, ofFloat17);
                }
                AnimatorSet animatorSet8 = this.LJJIII;
                if (animatorSet8 == null) {
                    return;
                }
                animatorSet8.start();
                return;
            case 4:
                if (c29750Bly2 == null) {
                    return;
                }
                this.LJJIIJZLJL = true;
                C29750Bly c29750Bly3 = new C29750Bly(c29750Bly2.LIZ, c29750Bly2.LIZIZ + j, c29750Bly2.LIZJ, c29750Bly2.LIZLLL, c29750Bly2.LJ, c29750Bly2.LJFF, c29750Bly2.LJI, c29750Bly2.LJII);
                StringBuilder LIZ13 = X1D.LIZ();
                LIZ13.append('+');
                LIZ13.append(j);
                String LIZIZ = X1D.LIZIZ(LIZ13);
                C31165CKz c31165CKz11 = this.LJJI;
                if (c31165CKz11 != null) {
                    c31165CKz11.setText(LIZIZ);
                }
                C31165CKz c31165CKz12 = this.LJJI;
                if (c31165CKz12 != null) {
                    c31165CKz12.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
                }
                KL2.LJIILLIIL(0, this.LJJI);
                C68322mC c68322mC = new C68322mC();
                IFansClubService iFansClubService2 = (IFansClubService) CN1.LIZ(IFansClubService.class);
                if (iFansClubService2 != null && (sx = iFansClubService2.sx((int) c29750Bly2.LIZ)) != 0 && (iHostResource3 = (IHostResource) CN1.LIZ(IHostResource.class)) != null && iHostResource3.Br0(sx.geckoChannel)) {
                    c68322mC.element = sx;
                }
                LJIL(false);
                OSZ LIZ14 = C116784iA.LIZ(this.LJJI, 100L, 0L, 0.6f, 1.1f);
                OSZ LIZ15 = C116784iA.LIZ(this.LJJI, 100L, 100L, 1.1f, 1.0f);
                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this.LJJI, (Property<C31165CKz, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat18.setDuration(100L);
                ofFloat18.addListener(new ALAdapterS4S0200000_5(this, c68322mC, 22));
                ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.LJJI, (Property<C31165CKz, Float>) View.TRANSLATION_Y, 0.0f, -C15380j0.LJFF(R.dimen.abz));
                ofFloat19.setDuration(300L);
                ofFloat19.setStartDelay(700L);
                ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.LJJI, (Property<C31165CKz, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat20.setDuration(600L);
                ofFloat20.setStartDelay(700L);
                ofFloat20.addListener(new ALAdapterS4S0200000_5(c29750Bly3, this, 23));
                LIZLLL();
                AnimatorSet animatorSet9 = this.LJJIII;
                if (animatorSet9 != null) {
                    animatorSet9.playTogether(LIZ14.getFirst(), LIZ14.getSecond(), LIZ15.getFirst(), LIZ15.getSecond(), ofFloat18, ofFloat19, ofFloat20);
                }
                AnimatorSet animatorSet10 = this.LJJIII;
                if (animatorSet10 == null) {
                    return;
                }
                animatorSet10.start();
                return;
            case 5:
                this.LJJIIJZLJL = true;
                KL2.LJIILLIIL(8, this.LJJI);
                if (c29750Bly2 != null) {
                    j2 = c29750Bly2.LIZ;
                } else {
                    j2 = 0;
                }
                IFansClubService iFansClubService3 = (IFansClubService) CN1.LIZ(IFansClubService.class);
                if (iFansClubService3 == null || (fansEntranceResConfig = iFansClubService3.sx((int) j2)) == null || (iHostResource2 = (IHostResource) CN1.LIZ(IHostResource.class)) == null || !iHostResource2.Br0(fansEntranceResConfig.geckoChannel)) {
                    fansEntranceResConfig = null;
                }
                LJIL(false);
                String str2 = "";
                if (fansEntranceResConfig != null && !TextUtils.isEmpty(fansEntranceResConfig.entranceLottieFileName) && !TextUtils.isEmpty(fansEntranceResConfig.geckoChannel)) {
                    String str3 = fansEntranceResConfig.entranceLottieFileName;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = fansEntranceResConfig.geckoChannel;
                    if (str4 == null) {
                        str4 = "";
                    }
                    LJIILLIIL(str3, str4);
                }
                FansClubSettings fansClubSettings = FansClubSettings.INSTANCE;
                if (fansClubSettings != null && (fansClubConfig = fansClubSettings.getFansClubConfig()) != null && (fansClubLottieConfig = fansClubConfig.fansClubLottieConfig) != null && (iHostResource = (IHostResource) CN1.LIZ(IHostResource.class)) != null) {
                    String str5 = fansClubLottieConfig.lottieChannel;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (iHostResource.Br0(str5) && !TextUtils.isEmpty(fansClubLottieConfig.finishAllTaskLottieName)) {
                        KL2.LJIILLIIL(0, this.LJJIFFI);
                        C29701Eo c29701Eo = this.LJJIFFI;
                        if (c29701Eo != null) {
                            c29701Eo.removeAllAnimatorListeners();
                        }
                        C29701Eo c29701Eo2 = this.LJJIFFI;
                        if (c29701Eo2 != null) {
                            c29701Eo2.addAnimatorListener(new IDAListenerS74S0100000_5(this, 32));
                        }
                        C29701Eo c29701Eo3 = this.LJJIFFI;
                        String str6 = fansClubLottieConfig.lottieChannel;
                        if (str6 != null) {
                            str2 = str6;
                        }
                        StringBuilder LIZ16 = X1D.LIZ();
                        C15490jB.LJIIL(c29701Eo3, str2, JBR.LJFF(LIZ16, fansClubLottieConfig.finishAllTaskLottieName, ".zip", LIZ16), "", true, null, null, 64);
                        this.LIZLLL = c29750Bly2;
                        return;
                    }
                }
                KL2.LJIILLIIL(8, this.LJJIFFI);
                LJIL(true);
                C29747Blv c29747Blv = this.LJJIJ;
                if (c29747Blv != null) {
                    c29747Blv.LIZ();
                }
                this.LIZLLL = c29750Bly2;
                return;
            case 6:
                if (c29750Bly2 == null) {
                    return;
                }
                this.LJJIIJZLJL = true;
                LJIJJLI(c29750Bly2);
                ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C31165CKz, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat21.setDuration(200L);
                ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(this.LJIILL, (Property<C47061t0, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat22.setDuration(200L);
                ofFloat22.addListener(new ALAdapterS4S0100000_5(this, 70));
                LIZLLL();
                AnimatorSet animatorSet11 = this.LJJIII;
                if (animatorSet11 != null) {
                    animatorSet11.playTogether(ofFloat21, ofFloat22);
                }
                AnimatorSet animatorSet12 = this.LJJIII;
                if (animatorSet12 != null) {
                    animatorSet12.start();
                }
                this.LIZLLL = c29750Bly2;
                return;
            case 7:
                if (z) {
                    this.LJJIIJZLJL = true;
                    Handler handler = this.LJ;
                    if (handler == null) {
                        return;
                    }
                    handler.postDelayed(new ARunnableS41S0100000_5(this, 301), this.LJIIIIZZ);
                    return;
                }
                LJIILJJIL();
                return;
            default:
                return;
        }
    }
}
