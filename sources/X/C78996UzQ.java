package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS41S1100000_1;
import Y.IDObjectS0S0101000;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton;
import com.ss.android.ugc.aweme.now.model.NowBatchReactionResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDqS176S0200000;
import ujb.o;

/* renamed from: X.UzQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78996UzQ implements InterfaceC41862Gbq, InterfaceC2315796z, InterfaceC48038ItG {
    public static boolean LJLIL;
    public static boolean LJLILLLLZI;
    public static final C78996UzQ LJLJI = new C78996UzQ();

    @Override // X.InterfaceC2315796z
    public void onAttachedToWindow() {
    }

    @Override // X.InterfaceC2315796z
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Region LJIIZILJ() {
        String LIZJ = C31461Li.LIZJ("priority_region", "", "getInstance()\n        .g…egionSetting::class.java)");
        if (o.LJJJJJL(LIZJ)) {
            LIZJ = C85990Xow.LIZIZ();
        }
        if (o.LJJJJJL(LIZJ)) {
            return null;
        }
        return new Region(null, 0 == true ? 1 : 0, LIZJ, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 59, 0 == true ? 1 : 0);
    }

    public static boolean LJJIII() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        if (str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals("samsung")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ() {
        return C56179M3b.LIZ.LJIILLIIL(1, C39849FkT.LIZ());
    }

    public static void LJI() {
        boolean equalsIgnoreCase;
        if (C16880lQ.LLLLIIIILLL() != C16880lQ.LLJJJJ().getThread()) {
            String str = EF7.LJIILIIL;
            if (TextUtils.isEmpty(str)) {
                equalsIgnoreCase = false;
            } else {
                equalsIgnoreCase = str.equalsIgnoreCase("local_test");
            }
            if (equalsIgnoreCase) {
                PJZ.LIZIZ(new Throwable("AsyncOperatorView"), "AsyncOperatorViewLancet");
                return;
            }
            String stackTraceString = android.util.Log.getStackTraceString(new Throwable("AsyncOperatorView"));
            System.err.println("AsyncOperatorView stack trace:--->:" + stackTraceString);
            PJZ.LIZIZ(new Throwable("AsyncOperatorView"), "AsyncOperatorViewLancet");
        }
    }

    public static final TokenCert LJIJI() {
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
            return TokenCert.Companion.with("bpea-ecom_address_request_locate");
        }
        return TokenCert.Companion.with("bpea-ecom_address_request_coarse_locate");
    }

    public static void LJJIJL() {
        if (AppLog.getSwitchToBdtracker()) {
            QKO qko = QKO.L1;
            if (qko == null || C38354F3m.LJ("account_region")) {
                return;
            }
            if (DeviceRegisterManager.getSwitchToBdtracker()) {
                C66795QJj.LIZJ(qko);
                return;
            }
            int i = QKP.LIZ[qko.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    QJY.LIZIZ.remove("account_region");
                }
            } else {
                QJY.LIZJ.remove("account_region");
            }
            if (C38354F3m.LJ("account_region")) {
                return;
            }
            if (DeviceRegisterManager.getSwitchToBdtracker()) {
                C66795QJj.LIZJ(qko);
                return;
            }
            int i2 = QKQ.LIZ[qko.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                QJZ.LJIIIIZZ.remove("account_region");
                return;
            }
            QJZ.LJIIIZ.remove("account_region");
            return;
        }
        try {
            Field declaredField = QJY.class.getDeclaredField("LIZIZ");
            declaredField.setAccessible(true);
            ((ConcurrentHashMap) declaredField.get(null)).remove("account_region");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final SY9 LJII(Context context) {
        Integer LJI;
        kotlin.jvm.internal.o.LJIIIZ(context, "<this>");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_magnifying_glass_fill;
        int intValue = ((Number) C52581KkL.LIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    LJI = C79045V0n.LJI(R.attr.go, context);
                } else {
                    LJI = C79045V0n.LJI(R.attr.bw, context);
                }
            } else {
                LJI = C79045V0n.LJI(R.attr.bx, context);
            }
        } else {
            LJI = C79045V0n.LJI(R.attr.c0, context);
        }
        c2068389v.LIZLLL = LJI;
        if (((Number) C52579KkJ.LIZ.getValue()).intValue() == 1) {
            c2068389v.LIZJ = C7MY.LIZIZ(8);
            c2068389v.LIZIZ = C7MY.LIZIZ(8);
        } else {
            c2068389v.LIZJ = C7MY.LIZIZ(10);
            c2068389v.LIZIZ = C7MY.LIZIZ(10);
        }
        SY9 LIZ = c2068389v.LIZ(context);
        LIZ.setBounds(0, 0, c2068389v.LIZIZ, c2068389v.LIZJ);
        return LIZ;
    }

    public static final void LJIIIZ(InterfaceC56182M3e callback) {
        kotlin.jvm.internal.o.LJIIIZ(callback, "callback");
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-ecom_address_map_locate");
        with.auth("svfi");
        TokenCert with2 = companion.with("bpea-ecom_address_map_decrypt_location_data");
        with2.auth("mckd");
        C51733KSb.LIZ("ttshop", "ship_address", with, with2, callback, 32);
    }

    public static final TextView LJIIJ(ViewGroup viewGroup) {
        TextView LJIIJ;
        kotlin.jvm.internal.o.LJIIIZ(viewGroup, "viewGroup");
        Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view = (View) iDObjectS0S0101000.next();
                if (view instanceof TextView) {
                    return (TextView) view;
                }
                if ((view instanceof ViewGroup) && (LJIIJ = LJIIJ((ViewGroup) view)) != null) {
                    return LJIIJ;
                }
            } else {
                return null;
            }
        }
    }

    public static Activity LJIIJJI(Context context) {
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return (Activity) contextWrapper.getBaseContext();
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }

    public static String LJIIL(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    public static final String LJIILIIL(CreativeModel creativeModel) {
        EditCapCutReuseModel.MusicInfo musicInfo;
        kotlin.jvm.internal.o.LJIIIZ(creativeModel, "<this>");
        EditCapCutReuseModel editCapCutReuseModel = creativeModel.initialModel.capCutReuseModel;
        if (editCapCutReuseModel != null && (musicInfo = editCapCutReuseModel.musicInfo) != null) {
            return musicInfo.getMusicId();
        }
        return null;
    }

    public static Aweme LJIILJJIL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isForwardAweme()) {
            return aweme.getForwardItem();
        }
        return aweme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CreativeModel LJIILL(Intent intent) {
        kotlin.jvm.internal.o.LJIIIZ(intent, "<this>");
        CreativeModel creativeModel = (CreativeModel) intent.getParcelableExtra("creative_model");
        if (creativeModel == null) {
            int i = -1;
            creativeModel = new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 31, 0 == true ? 1 : 0);
        }
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) intent.getParcelableExtra("creative_initial_model");
        if (creativeInitialModel != null) {
            creativeModel.initialModel = creativeInitialModel;
        }
        if (creativeModel.initialModel.vqEvaluationConfig != null) {
            creativeModel.checkPointModel.enableCheckPoint = false;
        }
        return creativeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CreativeModel LJIILLIIL(Bundle bundle) {
        kotlin.jvm.internal.o.LJIIIZ(bundle, "<this>");
        CreativeModel creativeModel = (CreativeModel) bundle.getParcelable("creative_model");
        if (creativeModel == null) {
            int i = -1;
            creativeModel = new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 31, 0 == true ? 1 : 0);
        }
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) bundle.getParcelable("creative_initial_model");
        if (creativeInitialModel != null) {
            creativeModel.initialModel = creativeInitialModel;
        }
        if (creativeModel.initialModel.vqEvaluationConfig != null) {
            creativeModel.checkPointModel.enableCheckPoint = false;
        }
        return creativeModel;
    }

    public static List LJIJ(Aweme aweme) {
        ArrayList arrayList = new ArrayList();
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        if (textExtra != null) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct != null && textExtraStruct.getCid() != null) {
                    arrayList.add(textExtraStruct.getCid());
                }
            }
        }
        return arrayList;
    }

    public static Aweme LJIJJLI(String str) {
        Aweme i6 = AwemeService.LIZ().i6(str);
        if (i6 == null) {
            Aweme n6 = AwemeService.LIZ().n6(str);
            if (n6 == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getAweme ");
                LIZ.append(str);
                LIZ.append(" is null, mock one");
                C36922EeM.LIZLLL(6, "DeleteAweme", X1D.LIZIZ(LIZ));
                Aweme aweme = new Aweme();
                aweme.setAid(str);
                return aweme;
            }
            return n6;
        }
        return i6;
    }

    public static final void LJJ(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final boolean LJJIFFI(CreativeModel creativeModel) {
        if (creativeModel.initialModel.articlePostModel != null) {
            return true;
        }
        return false;
    }

    public static boolean LJJII(Aweme aweme) {
        if (aweme.getStatus() != null) {
            return aweme.getStatus().isDelete();
        }
        return false;
    }

    public static boolean LJJIIJZLJL(View view) {
        if (view == null || !((Boolean) C52599Kkd.LIZ.getValue()).booleanValue() || (view instanceof ViewStub) || !view.isAttachedToWindow()) {
            return false;
        }
        return true;
    }

    public static void LJJIIZ(Aweme aweme) {
        if (aweme != null && aweme.getHotListStruct() != null) {
            aweme.getHotListStruct().getType();
        }
    }

    public static boolean LJJIIZI(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return false;
        }
        return TextUtils.equals(author.getUid(), HG3.LJIILL().getCurUser().getUid());
    }

    public static final C5H3 LJJIJIIJI(InterfaceC65784Pro initializer) {
        kotlin.jvm.internal.o.LJIIIZ(initializer, "initializer");
        return C221108m2.LIZ(EnumC221088m0.NONE, initializer);
    }

    public static final void LJJIJIIJIL(Comment comment) {
        kotlin.jvm.internal.o.LJIIIZ(comment, "<this>");
        String awemeId = comment.getAwemeId();
        kotlin.jvm.internal.o.LJIIIIZZ(awemeId, "awemeId");
        if (kotlin.jvm.internal.o.LJ("1", comment.getQrecVirtualEnable())) {
            Z9N.LIZIZ.LLJJJ(awemeId, true);
            List<TextExtraStruct> textExtra = comment.getTextExtra();
            if (textExtra != null && C8DR.LIZ()) {
                int i = 0;
                while (i < textExtra.size()) {
                    if (((TextExtraStruct) ListProtector.get(textExtra, i)).getType() == 6) {
                        Z9N.LIZIZ.LLLL(((TextExtraStruct) ListProtector.get(textExtra, i)).getSearchKeyword(), awemeId);
                        ListProtector.remove(textExtra, i);
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public static boolean LJJIJIL(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRiskModel() != null && (aweme.getAwemeRiskModel().isWarn() || aweme.getAwemeRiskModel().isNotice())) {
            return true;
        }
        return false;
    }

    public static void LJJIJLIJ(Class cls) {
        String name = cls.getName();
        C73548Stk.LIZIZ(new C73392SrE(UPJ.LIZIZ("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    public static void LJJJ(Activity activity) {
        android.net.Uri data;
        String queryParameter;
        if (activity.getIntent() != null && activity.getIntent().getData() != null && (queryParameter = UriProtector.getQueryParameter((data = activity.getIntent().getData()), "from")) != null && queryParameter.contains("com.tt.miniapp") && "1".equals(UriProtector.getQueryParameter(data, "isNeedRTLAnim")) && C90193gN.LIZIZ(activity)) {
            activity.overridePendingTransition(0, R.anim.g0);
        }
    }

    public static final void LJJJIL(C2064988n c2064988n) {
        Integer LJI;
        kotlin.jvm.internal.o.LJIIIZ(c2064988n, "<this>");
        int intValue = ((Number) C52581KkL.LIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    Context context = c2064988n.getContext();
                    kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
                    LJI = C79045V0n.LJI(R.attr.go, context);
                } else {
                    Context context2 = c2064988n.getContext();
                    kotlin.jvm.internal.o.LJIIIIZZ(context2, "context");
                    LJI = C79045V0n.LJI(R.attr.bw, context2);
                }
            } else {
                Context context3 = c2064988n.getContext();
                kotlin.jvm.internal.o.LJIIIIZZ(context3, "context");
                LJI = C79045V0n.LJI(R.attr.bx, context3);
            }
        } else {
            Context context4 = c2064988n.getContext();
            kotlin.jvm.internal.o.LJIIIIZZ(context4, "context");
            LJI = C79045V0n.LJI(R.attr.c0, context4);
        }
        if (LJI != null) {
            c2064988n.setSearchSpanColor(LJI.intValue());
        }
        if (((Number) C52579KkJ.LIZ.getValue()).intValue() == 1) {
            c2064988n.setSearchSpanStyle(101);
        } else {
            c2064988n.setSearchSpanStyle(102);
        }
    }

    public static final void LJJJJ(View view) {
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LJIIIIZZ(R.string.f61);
        c26045AKb.LJIIJ();
    }

    public static VNU LJJJJI(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof VNU) {
                return (VNU) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final long LJJJJIZL(long j) {
        return C1DF.LIZIZ((int) (j >> 32), C23490w5.LIZIZ(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    public static final ImageCardTemplate LJJJJJ(C79133V3x c79133V3x) {
        ImageCardTitleBar value;
        ActionLinkComponent LIZ;
        PreviewHintComponent LIZ2;
        ?? r9;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        ImageComponent LIZ3;
        TextComponent LIZ4;
        TextComponent LIZ5;
        ButtonComponent buttonComponent;
        RUF ruf;
        TextComponent LJJL;
        ActionLinkComponent LIZ6;
        V4R v4r = c79133V3x.title;
        if (v4r != null) {
            C79135V3z c79135V3z = v4r.image;
            if (c79135V3z != null) {
                LIZ3 = C79081V1x.LJJIZ(c79135V3z);
            } else {
                ImageComponent.Companion.getClass();
                LIZ3 = C79095V2l.LIZ();
            }
            RUF ruf2 = v4r.title;
            if (ruf2 == null || (LIZ4 = C17N.LJJL(ruf2)) == null) {
                TextComponent.Companion.getClass();
                LIZ4 = C79109V2z.LIZ();
            }
            RUF ruf3 = v4r.subtitle;
            if (ruf3 == null || (LIZ5 = C17N.LJJL(ruf3)) == null) {
                TextComponent.Companion.getClass();
                LIZ5 = C79109V2z.LIZ();
            }
            C79141V4f c79141V4f = v4r.button;
            if (c79141V4f == null || (ruf = c79141V4f.text) == null || (LJJL = C17N.LJJL(ruf)) == null) {
                buttonComponent = null;
            } else {
                C63714OzW c63714OzW = c79141V4f.link_info;
                if (c63714OzW != null) {
                    LIZ6 = C62814Ol0.LJJIIZI(c63714OzW);
                } else {
                    ActionLinkComponent.Companion.getClass();
                    LIZ6 = C63715OzX.LIZ();
                }
                buttonComponent = new ButtonComponent(LJJL, LIZ6);
            }
            value = new ImageCardTitleBar(LIZ3, LIZ4, LIZ5, buttonComponent);
        } else {
            ImageCardTitleBar.Companion.getClass();
            value = ImageCardTitleBar.EMPTY_IMAGE_CARD_TITLE_BAR$delegate.getValue();
        }
        C63714OzW c63714OzW2 = c79133V3x.link_info;
        if (c63714OzW2 != null) {
            LIZ = C62814Ol0.LJJIIZI(c63714OzW2);
        } else {
            ActionLinkComponent.Companion.getClass();
            LIZ = C63715OzX.LIZ();
        }
        V4L v4l = c79133V3x.preview_hint;
        if (v4l != null) {
            LIZ2 = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ2 = C79087V2d.LIZ();
        }
        List<V43> list = c79133V3x.videos;
        if (list != null) {
            r9 = new ArrayList();
            for (V43 it : list) {
                kotlin.jvm.internal.o.LJIIIIZZ(it, "it");
                r9.add(V3N.LJJIJIIJIL(it));
            }
        } else {
            r9 = C61878OQg.INSTANCE;
        }
        RU2 ru2 = c79133V3x.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = c79133V3x.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        return new ImageCardTemplate(value, LIZ, (List<VideoCoverComponent>) r9, LIZ2, baseResponseComponent, baseRequestComponent);
    }

    public static final void LJJJJL(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object t) {
        kotlin.jvm.internal.o.LJIIIZ(t, "t");
        return AbstractC73638SvC.LJIJ(new NowBatchReactionResponse(C61878OQg.INSTANCE, false));
    }

    @Override // X.InterfaceC41862Gbq
    public void log(String str) {
        H78.LIZIZ("TikTok-Publish", str);
    }

    public static final long LIZIZ(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.LifecycleObserver, X.1hd] */
    public static final IDqS176S0200000 LIZJ(final C04D c04d, Lifecycle lifecycle) {
        if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), Lifecycle.State.DESTROYED) > 0) {
            ?? r2 = new LifecycleEventObserver() { // from class: X.1hd
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C04D view = C04D.this;
                    kotlin.jvm.internal.o.LJIIIZ(view, "$view");
                    kotlin.jvm.internal.o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
                    kotlin.jvm.internal.o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        view.LIZLLL();
                    }
                }
            };
            lifecycle.addObserver(r2);
            return new IDqS176S0200000(lifecycle, (C40011hd) r2, 1);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot configure ");
        LIZ.append(c04d);
        LIZ.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        LIZ.append(lifecycle);
        LIZ.append("is already destroyed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public static final String LJIL(int i, Object... objArr) {
        String string = EF7.LIZIZ().getString(i, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.o.LJIIIIZZ(string, "AppContextManager.getApp…tring(resId, *formatArgs)");
        return string;
    }

    public static int LJJI(Aweme aweme, List list) {
        if (aweme != null && aweme.getAid() != null && list != null && !list.isEmpty()) {
            String aid = aweme.getAid();
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme2 = (Aweme) ListProtector.get(list, i);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int LJJIJ(Aweme aweme, List list) {
        if (aweme != null && aweme.getAid() != null && list != null && !list.isEmpty()) {
            String aid = aweme.getAid();
            for (int size = list.size() - 1; size > -1; size--) {
                Aweme aweme2 = (Aweme) ListProtector.get(list, size);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return size;
                }
            }
        }
        return -1;
    }

    public static final void LJJIZ(Intent intent, CreativeModel value) {
        kotlin.jvm.internal.o.LJIIIZ(intent, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(value, "value");
        intent.putExtra("creative_model", value);
    }

    @Override // X.InterfaceC2315796z
    public void LIZ(MusNotice notice, C2315596x c2315596x) {
        NoticeUITemplate noticeUITemplate;
        List<NoticeUITemplateButton> list;
        kotlin.jvm.internal.o.LJIIIZ(notice, "notice");
        GeneralTemplateNotice generalTemplateNotice = notice.templateNotice;
        if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (list = noticeUITemplate.bottomButtons) != null) {
            for (NoticeUITemplateButton noticeUITemplateButton : list) {
                Integer num = noticeUITemplateButton.type;
                if (num != null) {
                    if (num.intValue() == 0) {
                        LJFF(c2315596x.getNegativeButton(), noticeUITemplateButton, c2315596x);
                    } else if (num.intValue() == 2) {
                        LJFF(c2315596x.getPositiveButton(), noticeUITemplateButton, c2315596x);
                    }
                }
            }
        }
    }

    public static final InterfaceC07790Sh LIZLLL(InterfaceC07790Sh background, long j, InterfaceC11790dD shape) {
        kotlin.jvm.internal.o.LJIIIZ(background, "$this$background");
        kotlin.jvm.internal.o.LJIIIZ(shape, "shape");
        return background.LLLIIIL(new C49101wI(new C11850dJ(j), null, 0.0f, shape, 6));
    }

    public static void LJFF(C2S9 c2s9, NoticeUITemplateButton noticeUITemplateButton, C2315596x c2315596x) {
        c2s9.setText(noticeUITemplateButton.content);
        String str = noticeUITemplateButton.schemaUrl;
        if (str != null && C78685UuP.LJJJZ(str)) {
            c2s9.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS41S1100000_1(c2s9, str, 2)));
            return;
        }
        List<Integer> list = noticeUITemplateButton.actions;
        if (list == null || !(!list.isEmpty()) || ((Number) ListProtector.get(list, 0)).intValue() != 1) {
            return;
        }
        c2s9.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(c2315596x, 163)));
    }

    public static boolean LJIIIIZZ(Collection collection, Aweme aweme, List list) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            C36922EeM.LIZLLL(6, "DeleteAweme", "aweme is null or items is null, delete failed");
            return true;
        }
        String aid = aweme.getAid();
        Iterator it = collection.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Aweme aweme2 = (Aweme) it.next();
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    if (aweme.isLiveNoDeduplicate()) {
                        if (TextUtils.equals(aweme.getUniqueId(), aweme2.getUniqueId())) {
                            it.remove();
                            break;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete aweme : ");
        LIZ.append(aid);
        LIZ.append(", index is ");
        LIZ.append(i);
        C36922EeM.LIZLLL(6, "DeleteAweme", X1D.LIZIZ(LIZ));
        if (aweme.getSubAweme() != null) {
            collection.remove(aweme.getSubAweme());
        }
        if (i >= 0) {
            if (C79004UzY.LJJIFFI(list)) {
                return true;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C8BT c8bt = (C8BT) it2.next();
                if (c8bt instanceof InterfaceC51034K1e) {
                    ((InterfaceC51034K1e) c8bt).onItemDeleted(i);
                }
            }
            return true;
        }
        return false;
    }

    public static final String LJIJJ(CreativeModel creativeModel, Context context, String defaultToastMessage) {
        kotlin.jvm.internal.o.LJIIIZ(creativeModel, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(defaultToastMessage, "defaultToastMessage");
        DraftInfoModel draftInfoModel = creativeModel.draftInfoModel;
        if (draftInfoModel.isPublishedDraft) {
            String string = context.getString(R.string.q94);
            kotlin.jvm.internal.o.LJIIIIZZ(string, "{\n        context.getStr…postdraft_videosav)\n    }");
            return string;
        }
        if (!draftInfoModel.isConvertToNormalDraft) {
            return defaultToastMessage;
        }
        String string2 = context.getString(R.string.q8p);
        kotlin.jvm.internal.o.LJIIIIZZ(string2, "{\n        context.getStr…postdraft_drafperm)\n    }");
        return string2;
    }

    public static boolean LJJJI(AtomicReference atomicReference, InterfaceC92693kP interfaceC92693kP, Class cls) {
        if (interfaceC92693kP == null) {
            throw new NullPointerException("next is null");
        }
        while (!atomicReference.compareAndSet(null, interfaceC92693kP)) {
            if (atomicReference.get() != null) {
                interfaceC92693kP.dispose();
                if (atomicReference.get() != EnumC73857Syj.LJLIL) {
                    LJJIJLIJ(cls);
                }
                return false;
            }
        }
        return true;
    }

    public static final void LJJIL(Context context, String str, String str2, String previousPageName, InterfaceC54674Ld0 callback) {
        kotlin.jvm.internal.o.LJIIIZ(previousPageName, "previousPageName");
        kotlin.jvm.internal.o.LJIIIZ(callback, "callback");
        C85258Xd8 c85258Xd8 = new C85258Xd8(str, str2, previousPageName, false, 248);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C56179M3b.LIZ.LJIJI("ttshop", "ship_address", LJIJI(), LJJIFFI, c85258Xd8, callback, null);
            ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).requestSystemConversionPopup("ttshop", "ship_address", LJIJI(), LJJIFFI, c85258Xd8, null, true, true);
        }
    }

    public static final C69684RWm LJJJJJL(ProductPackStruct productPackStruct, Integer num, ProductUnavailableInfo productUnavailableInfo, String str, BuyButton buyButton) {
        int i;
        int i2;
        Boolean bool;
        Announcement announcement;
        ProductPrice productPrice;
        BuyButton buyButton2 = buyButton;
        ProductUnavailableInfo productUnavailableInfo2 = productUnavailableInfo;
        kotlin.jvm.internal.o.LJIIIZ(productPackStruct, "<this>");
        Integer num2 = productPackStruct.status;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 1;
        }
        Integer num3 = productPackStruct.bottomNavBarStyle;
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = 1;
        }
        SellerInfo sellerInfo = productPackStruct.sellerInfo;
        ProductBase productBase = productPackStruct.baseInfo;
        Integer num4 = null;
        if (productBase != null && (productPrice = productBase.priceInfo) != null) {
            bool = productPrice.needIcon;
        } else {
            bool = null;
        }
        if (buyButton2 == null) {
            buyButton2 = productPackStruct.buyButton;
        }
        AddToCartButton addToCartButton = productPackStruct.addToCartButton;
        if (productUnavailableInfo2 == null) {
            productUnavailableInfo2 = productPackStruct.unavailableInfo;
        }
        List<Announcement> list = productPackStruct.announcements;
        if (list != null) {
            announcement = (Announcement) ORZ.LJLLLL(list);
        } else {
            announcement = null;
        }
        SellerInfo sellerInfo2 = productPackStruct.sellerInfo;
        if (sellerInfo2 != null) {
            num4 = sellerInfo2.unreadMsgCount;
        }
        return new C69684RWm(i, i2, sellerInfo, bool, buyButton2, addToCartButton, productUnavailableInfo2, announcement, num, str, num4);
    }
}
