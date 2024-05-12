package com.ss.android.ugc.aweme.service;

import X.ACW;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C224048qm;
import X.C2316897k;
import X.C2316997l;
import X.C2317097m;
import X.C2317197n;
import X.C245649kW;
import X.C25817ABh;
import X.C25818ABi;
import X.C25819ABj;
import X.C25820ABk;
import X.C34011DWl;
import X.C53326KwM;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72083SQt;
import X.C78926UyI;
import X.C86670Xzu;
import X.C86775Y3v;
import X.C8VV;
import X.C91L;
import X.EF7;
import X.EnumC25835ABz;
import X.EnumC86777Y3x;
import X.InterfaceC46330IGg;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.Y04;
import X.Z9N;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ProgressDragHintViewModel;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionDebugAssem;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CaptionServiceImpl implements ICLACaptionService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C25819ABj.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C25818ABi.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C25817ABh.LJLIL);

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final C65776Prg LJ() {
        return C65352Pkq.LIZ(VideoCLACaptionAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final C65776Prg LJIIIZ() {
        return C65352Pkq.LIZ(VideoCLACaptionDebugAssem.class);
    }

    public static ICLACaptionService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(ICLACaptionService.class, false);
        if (LIZ != null) {
            return (ICLACaptionService) LIZ;
        }
        if (C58096Mr6.Q4 == null) {
            synchronized (ICLACaptionService.class) {
                if (C58096Mr6.Q4 == null) {
                    C58096Mr6.Q4 = new CaptionServiceImpl();
                }
            }
        }
        return C58096Mr6.Q4;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final boolean LIZIZ(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return false;
        }
        if (((ITranslationKevaService) this.LIZJ.getValue()).LIZLLL() && Y04.LIZIZ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        boolean LJJZZIII = Z9N.LIZIZ.LJJZZIII(aweme);
        if (z || C86670Xzu.LJ(aweme) || !LJJZZIII) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final boolean LIZJ(Aweme aweme) {
        return C72083SQt.LJJLIIIJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final ProgressDragHintViewModel LIZLLL(ActivityC45651qj activityC45651qj) {
        if (!C91L.LIZ() || activityC45651qj == null) {
            return null;
        }
        C65776Prg LIZ = C65352Pkq.LIZ(ProgressDragHintViewModel.class);
        return (ProgressDragHintViewModel) new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 1560), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), C184077Kh.LJLIL, C2317197n.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final boolean LJFF(Aweme aweme) {
        if (aweme.isAd() || TextUtils.isEmpty(aweme.getAid()) || C34011DWl.LIZ() || C53326KwM.LIZ() || aweme.getAwemeType() == 160) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        if (r7 != null) goto L49;
     */
    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.CaptionServiceImpl.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final ProgressDragHintViewModel LJIIJ(ActivityC45651qj activityC45651qj) {
        if (!C91L.LIZ() || activityC45651qj == null) {
            return null;
        }
        C65776Prg LIZ = C65352Pkq.LIZ(ProgressDragHintViewModel.class);
        return (ProgressDragHintViewModel) new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 1559), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), C184077Kh.LJLIL, C2317097m.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJIIJJI(ActivityC45651qj activityC45651qj) {
        if (C91L.LIZ() && activityC45651qj != null) {
            C65776Prg LIZ = C65352Pkq.LIZ(ProgressDragHintViewModel.class);
            ProgressDragHintViewModel progressDragHintViewModel = (ProgressDragHintViewModel) new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 789), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), C184077Kh.LJLIL, C2316897k.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
            progressDragHintViewModel.LJLILLLLZI = null;
            progressDragHintViewModel.L60();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJIIL(C86775Y3v c86775Y3v, boolean z) {
        EnumC25835ABz LIZ;
        C25820ABk c25820ABk = C25820ABk.LIZIZ;
        if (z) {
            LIZ = EnumC25835ABz.LANDSCAPE_CAPTIONS;
        } else {
            LIZ = ACW.LIZ();
        }
        c25820ABk.LIZ(LIZ, c86775Y3v);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJI(ActivityC45651qj activityC45651qj, View view, InterfaceC46330IGg interfaceC46330IGg) {
        if (view != null && interfaceC46330IGg != null && C91L.LIZ() && activityC45651qj != null) {
            C65776Prg LIZ = C65352Pkq.LIZ(ProgressDragHintViewModel.class);
            ((ProgressDragHintViewModel) new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 1558), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), C184077Kh.LJLIL, C2316997l.INSTANCE, (InterfaceC65784Pro) null, 384).getValue()).LJLIL = new WeakReference<>(interfaceC46330IGg);
            C8VV.LIZIZ(activityC45651qj, new AqS135S0200000_4(activityC45651qj, view, 210));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final FeedCaptionView LIZ(Context context, C245649kW c245649kW, InteractStickerStruct interactStickerStruct, C224048qm c224048qm, Aweme aweme, InterfaceC55235Lm3 interfaceC55235Lm3) {
        return new FeedCaptionView(interactStickerStruct.getType(), context, c224048qm, interactStickerStruct, c245649kW, aweme, interfaceC55235Lm3);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLACaptionService
    public final void LJII(Context context, String str, EnumC86777Y3x enterMethod, Aweme aweme, boolean z, Long l) {
        String uid;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterMethod, "enterMethod");
        int i = 0;
        if (aweme == null || l == null) {
            C16880lQ.LLZILL(Toast.makeText(EF7.LIZIZ(), R.string.rjy, 0));
            return;
        }
        long longValue = l.longValue();
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://caption/translate/creator_edit_caption");
        buildRoute.withParam("cla_subtitle_id", longValue);
        String aid = aweme.getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        buildRoute.withParam("item_id", aid);
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("enter_method", enterMethod.getValue());
        String aid2 = aweme.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        buildRoute.withParam("group_id", aid2);
        User author = aweme.getAuthor();
        if (author != null && (uid = author.getUid()) != null) {
            str2 = uid;
        }
        buildRoute.withParam("author_id", str2);
        buildRoute.withParam("aweme", aweme);
        buildRoute.withParam("add_caption_flow_entry", z);
        if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
            i = 1;
        }
        buildRoute.withParam("is_long", i);
        buildRoute.open();
    }
}
