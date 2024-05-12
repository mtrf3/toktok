package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import X.ABZ;
import X.AK4;
import X.AV1;
import X.AnonymousClass843;
import X.AnonymousClass936;
import X.C00F;
import X.C113554cx;
import X.C16880lQ;
import X.C188727au;
import X.C2058786d;
import X.C2058886e;
import X.C207668Da;
import X.C221108m2;
import X.C223048pA;
import X.C223728qG;
import X.C223878qV;
import X.C224048qm;
import X.C234869Jq;
import X.C245649kW;
import X.C32I;
import X.C36922EeM;
import X.C38836FMa;
import X.C41032G8m;
import X.C47261Igj;
import X.C53326KwM;
import X.C61878OQg;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C72083SQt;
import X.C74203TAh;
import X.C78996UzQ;
import X.C79004UzY;
import X.C86650Xza;
import X.C86657Xzh;
import X.C86669Xzt;
import X.C86670Xzu;
import X.C86678Y0c;
import X.C86679Y0d;
import X.C86680Y0e;
import X.C86681Y0f;
import X.C86687Y0l;
import X.ChoreographerFrameCallbackC223868qU;
import X.EnumC79546VJu;
import X.EnumC86684Y0i;
import X.EnumC86685Y0j;
import X.EnumC86686Y0k;
import X.EnumC86689Y0n;
import X.FMX;
import X.IQD;
import X.IQE;
import X.InterfaceC223648q8;
import X.InterfaceC54035LIp;
import X.InterfaceC55235Lm3;
import X.InterfaceC60152Xr;
import X.InterfaceC74204TAi;
import X.InterfaceC86702Y1a;
import X.InterfaceC86703Y1b;
import X.InterfaceC86704Y1c;
import X.J8H;
import X.ORS;
import X.ORY;
import X.ORZ;
import X.OSJ;
import X.OSZ;
import X.QD3;
import X.TBB;
import X.X1D;
import X.X65;
import X.Y01;
import X.Y02;
import X.Y06;
import X.Y09;
import X.Y0A;
import X.Y0B;
import X.Y0D;
import X.Y0E;
import X.Y0G;
import X.Y0H;
import X.Y0I;
import X.Y0J;
import X.Y0K;
import X.Y0M;
import X.Y0N;
import X.Y0O;
import X.Y0P;
import X.Y0R;
import X.Y0W;
import X.Y19;
import X.Y1E;
import X.Y1Q;
import X.Y1W;
import X.Y1Y;
import Y.IDComparatorS32S0000000_4;
import Y.IDComparatorS337S0100000_4;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.service.IFeedCaptionView;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.impl.WidgetOnTouchListener;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class InteractStickerWidget extends AbsInteractStickerWidget implements Observer, InterfaceC86703Y1b, InterfaceC74204TAi {
    public C245649kW LJLJLLL;
    public C224048qm LJLL;
    public InterfaceC223648q8 LJLLI;
    public WidgetOnTouchListener LJLLILLLL;
    public List<? extends InteractStickerStruct> LJLLJ;
    public List<? extends InteractStickerStruct> LJLLL;
    public InteractStickerViewModel LJLLLL;
    public C74203TAh LJLZ;
    public boolean LJZI;
    public InterfaceC55235Lm3 LLD;
    public Aweme LLFF;
    public List<Y1W> LJLLLLLL = new ArrayList();
    public HashMap<String, String> LJZ = new HashMap<>();
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 643));
    public final String LL = "Sticker.InteractStickerWidget";
    public final Map<Integer, Integer> LLF = C113554cx.LJJL(new OSZ(8, 1), new OSZ(9, 1), new OSZ(22, 1), new OSZ(6, 2), new OSZ(23, 2), new OSZ(17, 3), new OSZ(4, 3), new OSZ(7, 3), new OSZ(10, 4), new OSZ(3, 5), new OSZ(19, 6), new OSZ(88, 7));
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 642));
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(AnonymousClass936.LJLIL);
    public final StickerParamsProvider LLFZ = new StickerParamsProvider();
    public final SubtitleParamsProvider LLI = new SubtitleParamsProvider();
    public final InteractStickerWidget$feedModeBaseProtocol$1 LLIFFJFJJ = new FeedModeBaseProtocol() { // from class: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$feedModeBaseProtocol$1
        public int LJLIL = 8;

        @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
        public final void M2() {
            int i;
            IFeedCaptionView LJIL;
            IFeedCaptionView LJIL2 = InteractStickerWidget.this.LJIL();
            if (LJIL2 != null) {
                i = LJIL2.getVisibility();
            } else {
                i = 8;
            }
            this.LJLIL = i;
            if (i == 0 && (LJIL = InteractStickerWidget.this.LJIL()) != null) {
                LJIL.p0(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
        public final void s() {
            IFeedCaptionView LJIL;
            if (this.LJLIL == 0 && (LJIL = InteractStickerWidget.this.LJIL()) != null) {
                LJIL.p0(true);
            }
        }
    };

    /* loaded from: classes16.dex */
    public final class StickerParamsProvider implements ETParamsProvider<Y0D> {
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final Y0D t() {
            List<InteractStickerStruct> list;
            int i;
            int i2;
            String str;
            Object obj;
            boolean z;
            Y0N y0n;
            X65 x65;
            Y0N y0n2;
            X65 x652;
            Aweme aweme = InteractStickerWidget.this.LLFF;
            Y1Y y1y = null;
            if (aweme != null) {
                list = aweme.getInteractStickerStructs();
            } else {
                list = null;
            }
            List LIZIZ = Y02.LIZIZ(InteractStickerWidget.this.LLFF, list);
            Map<String, Object> LJIILIIL = TranslationServiceImpl.LJJIJ().LJIILIIL(InteractStickerWidget.this.LJLLLLLL);
            IQE LIZ = C86678Y0c.LIZ(InteractStickerWidget.this.LLFF);
            Aweme aweme2 = InteractStickerWidget.this.LLFF;
            if (aweme2 != null) {
                y1y = Y01.LIZIZ.LJIJI(aweme2);
            }
            if (((Number) ListProtector.get(LIZIZ, 0)).intValue() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            int intValue = ((Number) ListProtector.get(LIZIZ, 0)).intValue();
            int intValue2 = ((Number) ListProtector.get(LIZIZ, 1)).intValue();
            int intValue3 = ((Number) ListProtector.get(LIZIZ, 2)).intValue();
            boolean LJ = Y02.LJ(InteractStickerWidget.this.LLFF);
            if (LIZ == IQE.TRANSLATED && ((z = y1y instanceof Y0N)) && (y0n = (Y0N) y1y) != null && (x65 = y0n.LJ) != null && x65.LIZ != null && z && (y0n2 = (Y0N) y1y) != null && (x652 = y0n2.LJ) != null && x652.LIZIZ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            String LIZ2 = Y02.LIZ(InteractStickerWidget.this.LLFF);
            if (LJIILIIL == null || (obj = LJIILIIL.get("background_reduced_cnt")) == null || (str = obj.toString()) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            return new Y0D(i, LIZ2, intValue, intValue2, intValue3, LJ ? 1 : 0, str, i2);
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC54035LIp getParam() {
            if (d2(Y0D.class)) {
                return t();
            }
            return null;
        }

        public StickerParamsProvider() {
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
            o.LJIIIZ(clazz, "clazz");
            if (!o.LJ(clazz, Y0D.class)) {
                return false;
            }
            return ABZ.LIZ();
        }
    }

    /* loaded from: classes16.dex */
    public final class SubtitleParamsProvider implements ETParamsProvider<C86657Xzh> {
        public boolean LJLIL;

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final C86657Xzh t() {
            int i;
            Aweme aweme;
            C86657Xzh t;
            if (this.LJLIL) {
                this.LJLIL = false;
                IFeedCaptionView LJIL = InteractStickerWidget.this.LJIL();
                if (LJIL != null && (t = LJIL.t()) != null) {
                    return t;
                }
            }
            String LJIILJJIL = C86670Xzu.LJIILJJIL(InteractStickerWidget.this.LLFF);
            if (o.LJ(LJIILJJIL, EnumC79546VJu.REALTIME.getValue()) && IQD.LIZ().LJIIIIZZ(InteractStickerWidget.this.LLFF) && (aweme = InteractStickerWidget.this.LLFF) != null) {
                Y01.LIZIZ.LJ().LIZ(aweme, TBB.CLA_REALTIME_STATUS_SHOWN_CAPTION);
            }
            boolean LJJIFFI = C86670Xzu.LJJIFFI(InteractStickerWidget.this.LLFF);
            String LJIIJJI = C86670Xzu.LJIIJJI(InteractStickerWidget.this.LLFF);
            String LJIILL = C86670Xzu.LJIILL(InteractStickerWidget.this.LLFF);
            if (C86678Y0c.LIZ(InteractStickerWidget.this.LLFF) == IQE.TRANSLATED) {
                i = 1;
            } else {
                i = 0;
            }
            return new C86657Xzh(LJJIFFI ? 1 : 0, 1, 0, i, LJIIJJI, "captions", LJIILL, LJIILJJIL, C86670Xzu.LJIILL(InteractStickerWidget.this.LLFF));
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC54035LIp getParam() {
            if (d2(C86657Xzh.class)) {
                return t();
            }
            return null;
        }

        public SubtitleParamsProvider() {
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
            o.LJIIIZ(clazz, "clazz");
            IFeedCaptionView LJIL = InteractStickerWidget.this.LJIL();
            if (LJIL != null && LJIL.d2(clazz)) {
                this.LJLIL = true;
                return true;
            }
            if (!o.LJ(clazz, C86657Xzh.class) || !C86670Xzu.LJJIFFI(InteractStickerWidget.this.LLFF) || !C86670Xzu.LJIJJLI(InteractStickerWidget.this.LLFF)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int LJIIJ() {
        return R.layout.du7;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final InteractStickerViewModel LJIILJJIL() {
        if (this.LJLLLL == null) {
            InteractStickerViewModel interactStickerViewModel = new InteractStickerViewModel();
            this.LJLLLL = interactStickerViewModel;
            interactStickerViewModel.LJLJI = this;
        }
        InteractStickerViewModel interactStickerViewModel2 = this.LJLLLL;
        o.LJI(interactStickerViewModel2);
        return interactStickerViewModel2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LJIILLIIL() {
        Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
        while (it.hasNext()) {
            Y1E y1e = ((Y1W) it.next()).LIZJ;
            y1e.getStickerType();
            y1e.LIZJ();
        }
    }

    public final IFeedCaptionView LJIL() {
        for (Y1W y1w : this.LJLLLLLL) {
            if (y1w.LIZIZ.getType() == 11) {
                Y1E y1e = y1w.LIZJ;
                if (!(y1e instanceof IFeedCaptionView)) {
                    return null;
                }
                return (IFeedCaptionView) y1e;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void onDestroyView() {
        Iterator<Y1W> it = this.LJLLLLLL.iterator();
        while (it.hasNext()) {
            Y1E y1e = it.next().LIZJ;
            y1e.LJIIIIZZ(y1e.getStickerType());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LJIILL() {
        TranslationServiceImpl.LJJIJ().LJIIJJI(this.LJLLLLLL, this.LJZI, this.LJLLI);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.iv0("interact_sticker_data", this, false);
            this.LJLJJI.iv0("interact_sticker_video_data", this, false);
            this.LJLJJI.iv0("interact_sticker_aweme_data", this, false);
            this.LJLJJI.iv0("interact_sticker_clear_data", this, false);
            this.LJLJJI.iv0("interact_sticker_update_intro_layout_y", this, true);
            this.LJLJJI.iv0("viewholder_select_status_changed", this, true);
            this.LJLJJI.iv0("interact_text_translate_data", this, true);
            this.LJLJJI.iv0("interact_text_translate_status", this, true);
            this.LJLJJI.iv0("interact_sticker_delegate_single_tap", this, true);
            return;
        }
        LJIILJJIL().gv0("interact_sticker_data", this);
        LJIILJJIL().gv0("interact_sticker_video_data", this);
        LJIILJJIL().gv0("interact_sticker_aweme_data", this);
        LJIILJJIL().gv0("interact_sticker_clear_data", this);
        LJIILJJIL().hv0("interact_sticker_update_intro_layout_y", this, true);
        LJIILJJIL().hv0("viewholder_select_status_changed", this, true);
        LJIILJJIL().hv0("interact_text_translate_data", this, true);
        LJIILJJIL().hv0("interact_text_translate_status", this, true);
        LJIILJJIL().hv0("interact_sticker_delegate_single_tap", this, true);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        Iterator<Y1W> it = this.LJLLLLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZJ.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        Iterator<Y1W> it = this.LJLLLLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZJ.onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
        C223878qV c223878qV = (C223878qV) this.LJZL.getValue();
        c223878qV.LIZ.clear();
        C16880lQ.LLIIIJ().removeFrameCallback((ChoreographerFrameCallbackC223868qU) c223878qV.LIZIZ.getValue());
    }

    @Override // X.InterfaceC74204TAi
    public final C74203TAh LIZ() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC74204TAi
    public final void LIZLLL(C74203TAh c74203TAh) {
        this.LJLZ = c74203TAh;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        C224048qm c224048qm;
        EventBus.LIZJ().LJIILJJIL(this);
        if (view != null) {
            c224048qm = (C224048qm) view.findViewById(R.id.j71);
        } else {
            c224048qm = null;
        }
        this.LJLL = c224048qm;
        if (c224048qm != null) {
            c224048qm.setLayoutDirection(0);
        }
        Activity activity = LJIIIZ();
        o.LJIIIIZZ(activity, "activity");
        WidgetOnTouchListener widgetOnTouchListener = new WidgetOnTouchListener(activity, this.LJLLLLLL, this.LJLJLLL, this.LJLLI, this);
        this.LJLLILLLL = widgetOnTouchListener;
        C224048qm c224048qm2 = this.LJLL;
        if (c224048qm2 != null) {
            c224048qm2.setOnTouchListener(widgetOnTouchListener);
        }
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            this.LJLJLLL = (C245649kW) dataCenter.get("interact_sticker_data");
            this.LJLLJ = (List) this.LJLJJI.get("interact_sticker_aweme_data");
            this.LJLLL = (List) this.LJLJJI.get("interact_sticker_video_data");
        } else {
            this.LJLJLLL = (C245649kW) LJIILJJIL().get("interact_sticker_data");
            this.LJLLJ = (List) LJIILJJIL().get("interact_sticker_aweme_data");
            this.LJLLL = (List) LJIILJJIL().get("interact_sticker_video_data");
        }
        LJIJI(this.LJLJLLL);
        LJIJJ(this.LJLLJ, this.LJLLL);
    }

    public final void LJIJI(C245649kW c245649kW) {
        boolean z;
        C223048pA c223048pA;
        float f;
        if (c245649kW != null) {
            InterfaceC86704Y1c interfaceC86704Y1c = c245649kW.LJIILIIL;
            if (interfaceC86704Y1c != null) {
                c223048pA = interfaceC86704Y1c.LIZ();
            } else {
                c223048pA = null;
            }
            float f2 = 0.0f;
            if (c245649kW != null) {
                if (c223048pA != null) {
                    f = c223048pA.LIZ;
                } else {
                    f = 0.0f;
                }
                c245649kW.LIZ = f;
                if (c223048pA != null) {
                    f2 = c223048pA.LIZIZ;
                }
                c245649kW.LIZIZ = f2;
            }
        }
        C224048qm c224048qm = this.LJLL;
        if (c224048qm != null) {
            if (c245649kW != null) {
                z = c245649kW.LJIIL;
            } else {
                z = true;
            }
            c224048qm.setNeedConsumeEvent(z);
        }
        WidgetOnTouchListener widgetOnTouchListener = this.LJLLILLLL;
        if (widgetOnTouchListener != null) {
            widgetOnTouchListener.setInteractStickerParams(c245649kW);
        }
        if (c245649kW != null) {
            Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
            while (it.hasNext()) {
                Y1W y1w = (Y1W) it.next();
                y1w.LIZJ.LJII(c245649kW);
                View view = y1w.LIZ;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = 0;
                    layoutParams2.topMargin = 0;
                    view.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final int LJIJJLI(int i) {
        for (Map.Entry<Integer, Integer> entry : this.LLF.entrySet()) {
            if (entry.getKey().intValue() == i) {
                return entry.getValue().intValue();
            }
        }
        return 0;
    }

    public final void LJJ(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        C62814Ol0.LJJIIJZLJL(vScope, ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLFZ));
        C62814Ol0.LJJIIJZLJL(vScope, ETParamsProvider.class, C47261Igj.LJJIJIL(this.LLI));
        if (AnonymousClass843.LIZIZ()) {
            C62814Ol0.LJJIIJZLJL(vScope, FeedModeBaseProtocol.class, C47261Igj.LJJIJIL(this.LLIFFJFJJ));
        }
        this.LLD = vScope;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LLIFFJFJJ(Aweme aweme) {
        this.LLFF = aweme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        List interactStickerStructs;
        int i;
        ?? r6;
        String str2;
        AutocaptionType autocaptionType;
        List<Utterance> utterances;
        OSJ osj;
        C207668Da c207668Da = (C207668Da) obj;
        if (c207668Da == null || (str = c207668Da.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1213045287:
                if (!str.equals("interact_sticker_video_data")) {
                    return;
                }
                Object obj2 = c207668Da.LIZIZ;
                if (obj2 == null) {
                    obj2 = null;
                }
                List<? extends InteractStickerStruct> list = (List) obj2;
                this.LJLLL = list;
                LJIJJ(null, list);
                return;
            case -949174003:
                if (!str.equals("interact_sticker_aweme_data")) {
                    return;
                }
                Object obj3 = c207668Da.LIZIZ;
                if (obj3 == null) {
                    obj3 = null;
                }
                List<? extends InteractStickerStruct> list2 = (List) obj3;
                this.LJLLJ = list2;
                LJIJJ(list2, null);
                return;
            case -821385854:
                if (!str.equals("interact_sticker_update_intro_layout_y")) {
                    return;
                }
                Object obj4 = c207668Da.LIZIZ;
                if (obj4 == null) {
                    obj4 = null;
                }
                o.LJIIIIZZ(obj4, "kvData.getData()");
                OSZ osz = (OSZ) obj4;
                Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
                while (it.hasNext()) {
                    Y1W y1w = (Y1W) it.next();
                    if (y1w.LIZIZ.getType() == 11) {
                        y1w.LIZJ.LJI(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue());
                    }
                }
                return;
            case -484208756:
                if (!str.equals("interact_text_translate_status")) {
                    return;
                }
                Object obj5 = c207668Da.LIZIZ;
                if (obj5 == null) {
                    obj5 = null;
                }
                o.LJIIIIZZ(obj5, "kvData.getData()");
                this.LJZI = ((Boolean) obj5).booleanValue();
                String str3 = this.LL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stickerTranslateStatus: ");
                LIZ.append(this.LJZI);
                C36922EeM.LIZLLL(4, str3, X1D.LIZIZ(LIZ));
                if (this.LJZI) {
                    return;
                }
                Object obj6 = c207668Da.LIZIZ;
                if (obj6 == null) {
                    obj6 = null;
                }
                o.LJIIIIZZ(obj6, "kvData.getData()");
                TranslationServiceImpl.LJJIJ().LIZIZ(this.LJLLLLLL, ((Boolean) obj6).booleanValue(), this.LJLLI, this.LJZ);
                return;
            case -328001721:
                if (!str.equals("interact_sticker_clear_data")) {
                    return;
                }
                C224048qm c224048qm = this.LJLL;
                if (c224048qm != null) {
                    c224048qm.removeAllViews();
                }
                this.LJLLJ = null;
                this.LJLLL = null;
                this.LJLLLLLL = new ArrayList();
                return;
            case -153749291:
                if (!str.equals("interact_sticker_data")) {
                    return;
                }
                Object obj7 = c207668Da.LIZIZ;
                if (obj7 == null) {
                    obj7 = null;
                }
                C245649kW c245649kW = (C245649kW) obj7;
                this.LJLJLLL = c245649kW;
                LJIJI(c245649kW);
                return;
            case 1161260443:
                if (!str.equals("interact_sticker_delegate_single_tap")) {
                    return;
                }
                Object obj8 = c207668Da.LIZIZ;
                if (obj8 == null) {
                    obj8 = null;
                }
                if (!(obj8 instanceof OSJ) || (osj = (OSJ) obj8) == null) {
                    return;
                }
                float floatValue = ((Number) osj.getFirst()).floatValue();
                float floatValue2 = ((Number) osj.getSecond()).floatValue();
                int intValue = ((Number) osj.getThird()).intValue();
                InterfaceC223648q8 interfaceC223648q8 = this.LJLLI;
                if (interfaceC223648q8 == null) {
                    return;
                }
                long LJZL = interfaceC223648q8.LJZL();
                List<Y1W> list3 = this.LJLLLLLL;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) list3).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((Y1W) next).LIZJ.LJIIJ()) {
                        arrayList.add(next);
                    }
                }
                for (Y1W y1w2 : ORZ.LLIILII(arrayList)) {
                    if (y1w2.LIZJ.LJIIJJI(LJZL, floatValue, floatValue2, y1w2.LIZIZ.getType()) && (y1w2.LIZIZ.getType() != 19 || intValue != 3)) {
                        if (y1w2.LIZJ.LJIILIIL(LJZL, y1w2.LIZIZ.getType(), floatValue, floatValue2, new C86681Y0f(this, y1w2, floatValue, floatValue2))) {
                            return;
                        }
                    }
                }
                return;
            case 1245957572:
                if (!str.equals("interact_text_translate_data")) {
                    return;
                }
                Aweme aweme = this.LLFF;
                if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj9 : interactStickerStructs) {
                        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj9;
                        if (interactStickerStruct.getType() == 20 && (utterances = interactStickerStruct.getCaptionStruct().getUtterances()) != null && !utterances.isEmpty()) {
                            arrayList3.add(obj9);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) it3.next();
                        Iterator it4 = interactStickerStructs.iterator();
                        while (true) {
                            i = 18;
                            if (it4.hasNext()) {
                                Object next2 = it4.next();
                                InteractStickerStruct interactStickerStruct3 = (InteractStickerStruct) next2;
                                if (interactStickerStruct3.getType() == 18 && interactStickerStruct3.getIndex() == interactStickerStruct2.getIndex()) {
                                    if (next2 == null) {
                                    }
                                }
                            }
                        }
                        List<Utterance> utterances2 = interactStickerStruct2.getCaptionStruct().getUtterances();
                        if (utterances2 != null) {
                            r6 = new ArrayList(C32I.LJJL(utterances2, 10));
                            for (Utterance utterance : utterances2) {
                                InteractStickerStruct interactStickerStruct4 = new InteractStickerStruct();
                                long startTime = utterance.getStartTime();
                                long endTime = utterance.getEndTime();
                                interactStickerStruct4.setType(i);
                                interactStickerStruct4.setTextStruct(utterance.getText());
                                interactStickerStruct4.setIndex(interactStickerStruct2.getIndex());
                                List<NormalTrackTimeStamp> it5 = (List) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), interactStickerStruct2.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.2T7
                                }.getType());
                                o.LJIIIIZZ(it5, "it");
                                for (NormalTrackTimeStamp normalTrackTimeStamp : it5) {
                                    normalTrackTimeStamp.setStartTime((float) startTime);
                                    normalTrackTimeStamp.setEndTime((float) endTime);
                                }
                                interactStickerStruct4.setTrackList(GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), it5));
                                String bgColor = utterance.getBgColor();
                                String textColor = utterance.getTextColor();
                                List<AutocaptionType> autoCaptions = interactStickerStruct2.getCaptionStruct().getAutoCaptions();
                                if (autoCaptions == null || (autocaptionType = (AutocaptionType) ORZ.LJLLLL(autoCaptions)) == null || (str2 = autocaptionType.getLanguage()) == null) {
                                    str2 = "";
                                }
                                interactStickerStruct4.setTextInfo(new TextStickerInfo(bgColor, textColor, str2, utterance.getSrcWidth(), utterance.getSrcHeight(), utterance.getTextSize(), utterance.getAlignment()));
                                r6.add(interactStickerStruct4);
                                i = 18;
                            }
                        } else {
                            r6 = C61878OQg.INSTANCE;
                        }
                        interactStickerStructs.addAll(r6);
                        arrayList2.addAll(r6);
                    }
                    if (!arrayList2.isEmpty()) {
                        LJIJJ(null, arrayList2);
                    }
                }
                Object obj10 = c207668Da.LIZIZ;
                if (obj10 == null) {
                    obj10 = null;
                }
                o.LJIIIIZZ(obj10, "kvData.getData()");
                this.LJZ = (HashMap) obj10;
                TranslationServiceImpl.LJJIJ().LIZIZ(this.LJLLLLLL, this.LJZI, this.LJLLI, this.LJZ);
                return;
            case 1341960156:
                if (!str.equals("viewholder_select_status_changed")) {
                    return;
                }
                Object obj11 = c207668Da.LIZIZ;
                if (obj11 == null) {
                    obj11 = null;
                }
                o.LJIIIIZZ(obj11, "kvData.getData()");
                if (((Boolean) obj11).booleanValue()) {
                    Iterator it6 = ((ArrayList) this.LJLLLLLL).iterator();
                    while (it6.hasNext()) {
                        ((Y1W) it6.next()).LIZJ.LJJII();
                    }
                    return;
                } else {
                    Iterator it7 = ((ArrayList) this.LJLLLLLL).iterator();
                    while (it7.hasNext()) {
                        ((Y1W) it7.next()).LIZJ.LJJIIZ();
                    }
                    return;
                }
            default:
                return;
        }
    }

    @QD3
    public final void onDissmissInteractWindow(C223728qG event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
        while (it.hasNext()) {
            Y1W y1w = (Y1W) it.next();
            if (y1w.LIZJ.LJ() != i) {
                Y1E y1e = y1w.LIZJ;
                y1e.getStickerType();
                y1e.LIZJ();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowSubtitleOptions(Y19 event) {
        String str;
        IFeedCaptionView LJIL;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        Aweme aweme = this.LLFF;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str) && (LJIL = LJIL()) != null) {
            LJIL.C0(event.LJLJI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.7au] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.Xzt, X.Xza, java.lang.Object] */
    @QD3(threadMode = ThreadMode.MAIN)
    public final void onVideoPlayEventLog(J8H event) {
        int i;
        String str;
        EnumC86689Y0n enumC86689Y0n;
        ?? r11;
        double d;
        boolean z;
        boolean z2;
        String str2;
        List<InteractStickerStruct> list;
        int i2;
        String str3;
        String desc;
        String value;
        String value2;
        String value3;
        o.LJIIIZ(event, "event");
        if (C86678Y0c.LIZ(this.LLFF) == IQE.TRANSLATED) {
            i = 1;
        } else {
            i = 0;
        }
        boolean LIZ = C2058886e.LIZ(this.LLFF);
        String str4 = event.LJLIL;
        Aweme aweme = this.LLFF;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str4, str)) {
            IFeedCaptionView LJIL = LJIL();
            if (LJIL != null) {
                enumC86689Y0n = LJIL.LLZLL();
            } else {
                enumC86689Y0n = null;
            }
            IFeedCaptionView LJIL2 = LJIL();
            if (LJIL2 != null) {
                r11 = LJIL2.z0();
            } else {
                r11 = 0;
            }
            IFeedCaptionView LJIL3 = LJIL();
            if (LJIL3 != null) {
                d = LJIL3.LLLLZI();
            } else {
                d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            boolean LJJLIIIJL = C72083SQt.LJJLIIIJL(this.LLFF);
            if (Y02.LJ(this.LLFF) && ABZ.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            boolean LJIIIIZZ = CaptionServiceImpl.LJIILIIL().LJIIIIZZ(this.LLFF);
            if ((LJJLIIIJL || z) && !LJIIIIZZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ?? r8 = (C86650Xza) this.LLFFF.getValue();
                String str5 = event.LJLILLLLZI;
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(LIZ ? 1 : 0);
                int LJJJIL = C79004UzY.LJJJIL(this.LJLIL, this.LLFF);
                r8.getClass();
                ?? c188727au = new C188727au();
                c188727au.LJI("target_lang", ((ITranslationService) r8.LJ.getValue()).LJJIIZI());
                Y02.LJFF(r8.LIZ, str5, valueOf, valueOf2, c188727au);
                Aweme aweme2 = r8.LIZ;
                if (aweme2 != null && ABZ.LIZ() && Y02.LIZJ(aweme2.getInteractStickerStructs())) {
                    Y0K.LIZ(c188727au, aweme2, C86678Y0c.LIZ(aweme2), false);
                }
                if (enumC86689Y0n != null) {
                    if (r11 != 0) {
                        c188727au.LJI("captions_show_type", "icon");
                    } else {
                        C86669Xzt.LIZIZ(c188727au, enumC86689Y0n);
                    }
                    r8.LJII(c188727au);
                    r8.LJIIJJI(c188727au);
                    r8.LJIIIZ(c188727au);
                    r8.LJIIJ(c188727au);
                    c188727au.LIZLLL(0, "have_transl");
                    c188727au.LIZLLL(0, "use_transl");
                    r8.LJIIIIZZ(c188727au);
                    r8.LIZLLL(c188727au);
                    c188727au.LIZLLL(r11, "is_captions_intro_show");
                    c188727au.LIZJ("launch_volume_pct", d);
                }
                r8.LIZJ(c188727au);
                if (C41032G8m.LIZ()) {
                    if (AK4.LIZ().LIZJ()) {
                        value = EnumC86686Y0k.ON.getValue();
                    } else {
                        value = EnumC86686Y0k.OFF.getValue();
                    }
                    c188727au.LJIIIZ("translation_status", value);
                    if (AK4.LIZ().LIZJ()) {
                        value2 = EnumC86685Y0j.ON.getValue();
                    } else {
                        value2 = EnumC86685Y0j.OFF.getValue();
                    }
                    c188727au.LJIIIZ("translate_title_status", value2);
                    if (AK4.LIZ().LJJJIL()) {
                        value3 = EnumC86684Y0i.ON.getValue();
                    } else {
                        value3 = EnumC86684Y0i.OFF.getValue();
                    }
                    c188727au.LJI("translate_sticker_status", value3);
                }
                Aweme aweme3 = r8.LIZ;
                if (aweme3 != null) {
                    list = aweme3.getInteractStickerStructs();
                } else {
                    list = null;
                }
                c188727au.LIZLLL(Y02.LIZLLL(list) ? 1 : 0, "has_text_sticker");
                c188727au.LIZLLL(Y02.LJ(r8.LIZ) ? 1 : 0, "is_text_sticker_translatable");
                c188727au.LIZLLL(((ITranslationService) r8.LJ.getValue()).LJJIII(r8.LIZ) ? 1 : 0, "is_text_sticker_translated");
                c188727au.LIZLLL(LJJJIL, "is_landscape_screen");
                Aweme aweme4 = r8.LIZ;
                if (aweme4 != null && (desc = aweme4.getDesc()) != null && desc.length() > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c188727au.LIZLLL(i2, "has_title");
                c188727au.LIZLLL(C2058886e.LIZ(r8.LIZ) ? 1 : 0, "is_title_translatable");
                c188727au.LIZLLL(((ITranslationService) r8.LJ.getValue()).LJIILL(r8.LIZ) ? 1 : 0, "is_title_translated");
                User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                Aweme aweme5 = r8.LIZ;
                if (aweme5 != null) {
                    str3 = aweme5.getAuthorUid();
                } else {
                    str3 = null;
                }
                c188727au.LIZLLL(o.LJ(str3, currentUser.getUid()) ? 1 : 0, "is_author");
                FMX.LJIIL("video_play_cla_related", c188727au.LIZ);
            }
            if (enumC86689Y0n != null) {
                C86650Xza c86650Xza = (C86650Xza) this.LLFFF.getValue();
                int LJJJIL2 = C79004UzY.LJJJIL(this.LJLIL, this.LLFF);
                c86650Xza.getClass();
                if (enumC86689Y0n == EnumC86689Y0n.EXPANDED) {
                    ICaptionKevaService LJJJJI = CaptionKevaServiceImpl.LJJJJI();
                    C188727au c188727au2 = new C188727au();
                    c86650Xza.LJII(c188727au2);
                    c188727au2.LIZLLL(0, "have_transl");
                    c188727au2.LIZLLL(0, "use_transl");
                    c86650Xza.LJIIJJI(c188727au2);
                    c86650Xza.LJIIIZ(c188727au2);
                    c188727au2.LIZLLL(LJJJIL2, "is_landscape_screen");
                    if (LJJJJI.LJI()) {
                        str2 = "off";
                    } else {
                        str2 = "on";
                    }
                    c188727au2.LJIIIZ("subtitle_status", str2);
                    C38836FMa.LIZLLL("subtitle_video_show", c188727au2.LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC86703Y1b
    public final void LIZIZ(long j, MotionEvent motionEvent) {
        float f;
        float f2;
        for (Y1W y1w : ORZ.LLIILII(this.LJLLLLLL)) {
            Y1E y1e = y1w.LIZJ;
            int stickerType = y1e.getStickerType();
            if (motionEvent != null) {
                f = motionEvent.getX();
                f2 = motionEvent.getY();
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (y1e.LJIILIIL(j, stickerType, f, f2, new C86679Y0d(this, y1w, motionEvent))) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(InteractStickerStruct interactStickerStruct, InterfaceC86702Y1a interfaceC86702Y1a) {
        View LIZ;
        View LIZ2;
        View LIZ3;
        View LIZ4;
        if (C79004UzY.LJJIFFI(this.LJLLLLLL)) {
            Y1E LIZ5 = interfaceC86702Y1a.LIZ();
            if (LIZ5 != null) {
                View LIZ6 = LIZ5.LIZ(LIZ5.getStickerType());
                o.LJI(LIZ6);
                LJIJ(0, LIZ6, interactStickerStruct, LIZ5, false);
                return;
            }
            return;
        }
        if (interactStickerStruct.getType() == 18) {
            for (C2058786d c2058786d : ORZ.LLIILII(ORZ.LLJJI(this.LJLLLLLL))) {
                int i = c2058786d.LIZ;
                Y1W y1w = (Y1W) c2058786d.LIZIZ;
                if (y1w.LIZIZ.getType() == 18) {
                    if (y1w.LIZIZ.getIndex() <= interactStickerStruct.getIndex()) {
                        Y1E LIZ7 = interfaceC86702Y1a.LIZ();
                        if (LIZ7 == null || (LIZ3 = LIZ7.LIZ(LIZ7.getStickerType())) == null) {
                            return;
                        }
                        LJIJ(i + 1, LIZ3, interactStickerStruct, LIZ7, false);
                        return;
                    }
                    if (i == 0) {
                        Y1E LIZ8 = interfaceC86702Y1a.LIZ();
                        if (LIZ8 == null || (LIZ4 = LIZ8.LIZ(LIZ8.getStickerType())) == null) {
                            return;
                        }
                        LJIJ(0, LIZ4, interactStickerStruct, LIZ8, false);
                        return;
                    }
                } else {
                    Y1E LIZ9 = interfaceC86702Y1a.LIZ();
                    if (LIZ9 == null || (LIZ2 = LIZ9.LIZ(LIZ9.getStickerType())) == null) {
                        return;
                    }
                    LJIJ(i + 1, LIZ2, interactStickerStruct, LIZ9, false);
                    return;
                }
            }
            return;
        }
        Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            Y1W y1w2 = (Y1W) it.next();
            if (o.LJ(y1w2.LIZIZ, interactStickerStruct)) {
                y1w2.LIZJ.LIZLLL(interactStickerStruct);
                return;
            }
            if (!ORY.LJJIJIIJIL(Integer.valueOf(interactStickerStruct.getType()), (Object[]) this.LLFII.getValue()) && y1w2.LIZIZ.getType() == interactStickerStruct.getType()) {
                Y1E LIZ10 = interfaceC86702Y1a.LIZ();
                if (LIZ10 == null) {
                    return;
                }
                View LIZ11 = LIZ10.LIZ(LIZ10.getStickerType());
                o.LJI(LIZ11);
                LJIJ(i2, LIZ11, interactStickerStruct, LIZ10, true);
                return;
            }
            Y1E LIZ12 = interfaceC86702Y1a.LIZ();
            if (LIZ12 == null || (LIZ = LIZ12.LIZ(LIZ12.getStickerType())) == null) {
                i2 = i3;
            } else {
                LJIJ(((ArrayList) this.LJLLLLLL).size(), LIZ, interactStickerStruct, LIZ12, false);
                return;
            }
        }
    }

    public final void LJIJJ(List<? extends InteractStickerStruct> list, List<? extends InteractStickerStruct> list2) {
        List list3;
        List list4;
        InterfaceC86704Y1c interfaceC86704Y1c;
        Aweme aweme;
        C224048qm c224048qm;
        User user;
        String str;
        List<? extends InteractStickerStruct> list5 = list2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : list) {
                if (interactStickerStruct.getType() == 5) {
                    arrayList2.add(interactStickerStruct);
                }
            }
            list3 = ORZ.LLILII(new IDComparatorS32S0000000_4(4), arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (InteractStickerStruct interactStickerStruct2 : list) {
                if (interactStickerStruct2.getType() != 5) {
                    arrayList3.add(interactStickerStruct2);
                }
            }
            list4 = ORZ.LLILII(new IDComparatorS337S0100000_4(this, 0), arrayList3);
        } else {
            list3 = null;
            list4 = null;
        }
        if (list5 == null) {
            list5 = C61878OQg.INSTANCE;
        }
        arrayList.addAll(list5);
        if (list3 == null) {
            list3 = C61878OQg.INSTANCE;
        }
        arrayList.addAll(list3);
        if (list4 == null) {
            list4 = C61878OQg.INSTANCE;
        }
        arrayList.addAll(list4);
        ORS.LJJLIL(C86687Y0l.LJLIL, arrayList);
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct3 = (InteractStickerStruct) it.next();
            if (interactStickerStruct3.getType() == 88 && interactStickerStruct3.getAddYoursStickerStruct() != null) {
                IAddYoursService LJIJ = AddYoursServiceImpl.LJIJ();
                Aweme aweme2 = this.LLFF;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct3.getAddYoursStickerStruct();
                o.LJIIIIZZ(addYoursStickerStruct, "it.addYoursStickerStruct");
                interactStickerStruct3.setAddYoursStickerStruct(LJIJ.LJIILL(str, AddYoursStickerStruct.copy$default(addYoursStickerStruct, null, null, null, null, null, null, null, null, null, 0L, 1023, null)));
            }
            arrayList4.add(interactStickerStruct3);
        }
        Iterator it2 = ((ArrayList) ORZ.LLJILJILJ(arrayList4)).iterator();
        while (it2.hasNext()) {
            InteractStickerStruct interactStickerStruct4 = (InteractStickerStruct) it2.next();
            int type = interactStickerStruct4.getType();
            if (type != 22) {
                if (type != 23) {
                    if (type != 88) {
                        switch (type) {
                            case 2:
                                LJIIZILJ(interactStickerStruct4, new Y06(this, interactStickerStruct4));
                                break;
                            case 3:
                                LJIIZILJ(interactStickerStruct4, new Y0A(this, interactStickerStruct4));
                                break;
                            case 4:
                                LJIIZILJ(interactStickerStruct4, new Y0R(this, interactStickerStruct4));
                                break;
                            case 5:
                                LJIIZILJ(interactStickerStruct4, new Y0M(this, interactStickerStruct4));
                                break;
                            case 6:
                                LJIIZILJ(interactStickerStruct4, new Y0P(this, interactStickerStruct4));
                                break;
                            case 7:
                                LJIIZILJ(interactStickerStruct4, new Y0O(this, interactStickerStruct4));
                                break;
                            case 8:
                            case 9:
                                LJIIZILJ(interactStickerStruct4, new Y0I(this, interactStickerStruct4));
                                break;
                            case 10:
                                LJIIZILJ(interactStickerStruct4, new Y09(this, interactStickerStruct4));
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                if (C53326KwM.LIZ()) {
                                    Aweme aweme3 = this.LLFF;
                                    if (aweme3 != null) {
                                        user = aweme3.getAuthor();
                                    } else {
                                        user = null;
                                    }
                                    if (!AV1.LJIJ(user)) {
                                        return;
                                    }
                                }
                                if (C72083SQt.LJJLIIIJL(this.LLFF) && (c224048qm = this.LJLL) != null) {
                                    LJIIZILJ(interactStickerStruct4, new Y0B(this, interactStickerStruct4, c224048qm));
                                    break;
                                }
                                break;
                            default:
                                switch (type) {
                                    case 17:
                                        LJIIZILJ(interactStickerStruct4, new Y0H(this, interactStickerStruct4));
                                        break;
                                    case 18:
                                        LJIIZILJ(interactStickerStruct4, new Y0W(this, interactStickerStruct4));
                                        break;
                                    case 19:
                                        C224048qm c224048qm2 = this.LJLL;
                                        if (c224048qm2 != null && (aweme = this.LLFF) != null) {
                                            LJIIZILJ(interactStickerStruct4, new C86680Y0e(this, interactStickerStruct4, c224048qm2, aweme));
                                            break;
                                        }
                                        break;
                                }
                        }
                    } else if (C234869Jq.LIZ()) {
                        LJIIZILJ(interactStickerStruct4, new Y0J(this, interactStickerStruct4));
                    }
                } else if (C00F.LIZ(31744, 0, "enable_nature_sticker_consumption", true) == 1) {
                    LJIIZILJ(interactStickerStruct4, new Y0E(this, interactStickerStruct4));
                }
            } else {
                LJIIZILJ(interactStickerStruct4, new Y0G(this, interactStickerStruct4));
            }
        }
        WidgetOnTouchListener widgetOnTouchListener = this.LJLLILLLL;
        if (widgetOnTouchListener != null) {
            widgetOnTouchListener.updateInteractStickers(this.LJLLLLLL);
        }
        C245649kW c245649kW = this.LJLJLLL;
        if (c245649kW != null && (interfaceC86704Y1c = c245649kW.LJIILIIL) != null) {
            interfaceC86704Y1c.LIZ();
        }
        Iterator it3 = ((ArrayList) this.LJLLLLLL).iterator();
        while (it3.hasNext()) {
            View view = ((Y1W) it3.next()).LIZ;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = 0;
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // X.InterfaceC86703Y1b
    public final void LJFF(long j, int i, MotionEvent motionEvent) {
        Y1Q y1q;
        LIZIZ(j, motionEvent);
        C245649kW c245649kW = this.LJLJLLL;
        if (c245649kW != null && (y1q = c245649kW.LJIILJJIL) != null) {
            y1q.handleDoubleClick(motionEvent);
        }
    }

    public final void LJIJ(int i, View view, InteractStickerStruct interactStickerStruct, Y1E y1e, boolean z) {
        if (i >= 0 && i < ((ArrayList) this.LJLLLLLL).size() && z) {
            try {
                ListProtector.remove(this.LJLLLLLL, i);
                C224048qm c224048qm = this.LJLL;
                if (c224048qm != null) {
                    try {
                        if (C78996UzQ.LJJIIJZLJL(c224048qm.getChildAt(i))) {
                            C78996UzQ.LJI();
                        }
                    } catch (Throwable unused) {
                    }
                    c224048qm.removeViewAt(i);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        ListProtector.add(this.LJLLLLLL, i, new Y1W(view, interactStickerStruct, y1e));
        C224048qm c224048qm2 = this.LJLL;
        if (c224048qm2 != null) {
            c224048qm2.addView(view, i);
        }
    }
}
