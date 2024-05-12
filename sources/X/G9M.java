package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9M {
    public static final G9M LIZ = new G9M();
    public static boolean LIZIZ;

    public static String LIZIZ(int i, boolean z) {
        if (i != 0) {
            if (i == 1) {
                return "private";
            }
            if (i == 2) {
                return "friends";
            }
            if (i == 3) {
                return "exclude";
            }
            if (i == 4) {
                return "only_subscriber";
            }
        } else if (z) {
            return "followers";
        }
        return "public";
    }

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (o.LJ(videoPublishEditModel.enterFrom, "video_post_page")) {
            String LJJIFFI = H7R.LJJIFFI(videoPublishEditModel);
            if (LJJIFFI == null) {
                return "";
            }
            return LJJIFFI;
        }
        return H7R.LJIIIIZZ(videoPublishEditModel);
    }

    public static final void LIZJ(VideoPublishEditModel model, String str, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(model, "model");
        boolean LIZ2 = PrivacyServiceImpl.LIZIZ().LIZ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("content_source", LIZ(model));
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("enter_method", "publishing");
        c145995oB.LJI("enter_type", H8F.LJIIIZ(model));
        c145995oB.LIZ(LIZ2 ? 1 : 0, "is_private");
        c145995oB.LJI("current_status", LIZIZ(model.isPrivate, LIZ2));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c145995oB);
        }
        FMX.LJIIL("click_privacy_setting", c145995oB.LIZ);
    }

    public final void LJI(VideoPublishEditModel model, int i, int i2) {
        o.LJIIIZ(model, "model");
        boolean LIZ2 = PrivacyServiceImpl.LIZIZ().LIZ();
        String LIZIZ2 = LIZIZ(i, LIZ2);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("content_source", LIZ(model));
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("to_status", LIZIZ2);
        c145995oB.LIZ(LIZ2 ? 1 : 0, "is_private");
        c145995oB.LJI("enter_method", "publishing");
        c145995oB.LJI("from_status", LIZIZ(i2, LIZ2));
        FMX.LJIIL("edit_page_change_privacy_settings_toast", c145995oB.LIZ);
    }

    public static final void LIZLLL(int i, String str, String str2, AST dismissReason) {
        String str3;
        boolean z;
        String str4;
        String str5;
        o.LJIIIZ(dismissReason, "dismissReason");
        if (dismissReason instanceof G9N) {
            str3 = "click_post";
        } else if (dismissReason instanceof ASY) {
            str3 = "click_cross";
        } else if (dismissReason instanceof ASW) {
            str3 = "made_choice";
        } else {
            str3 = "background";
        }
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null && LJ.LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str4 = "empty";
                } else {
                    str4 = "friends";
                }
            } else {
                str4 = "private";
            }
        } else if (z) {
            str4 = "followers";
        } else {
            str4 = "everyone";
        }
        C145995oB c145995oB = new C145995oB();
        if (LIZIZ) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_1st_show", str5);
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("enter_method", str2);
        c145995oB.LJI("exit_method", str3);
        c145995oB.LJI("audience_choice", str4);
        FMX.LJIIL("audience_select_bottom_sheet_results", c145995oB.LIZ);
    }

    public static final void LJFF(VideoPublishEditModel model, String str, int i, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns) {
        boolean z;
        String str2;
        String str3;
        o.LJIIIZ(model, "model");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        boolean z2 = false;
        if (currentUser != null && currentUser.LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "empty";
                } else {
                    str2 = "friends";
                }
            } else {
                str2 = "private";
            }
        } else if (z) {
            str2 = "followers";
        } else {
            str2 = "everyone";
        }
        if (model.isPrivate() == -1) {
            z2 = true;
        }
        LIZIZ = z2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("content_source", LIZ(model));
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("enter_method", model.creativeModel.transientPostPageModel.LJJIIJZLJL);
        if (LIZIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_1st_show", str3);
        c145995oB.LJI("default_choice", str2);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c145995oB);
        }
        FMX.LJIIL("show_audience_select_bottom_sheet", c145995oB.LIZ);
    }

    public static final void LJ(VideoPublishEditModel model, String str, int i, int i2, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(model, "model");
        boolean LIZ2 = PrivacyServiceImpl.LIZIZ().LIZ();
        String LIZIZ2 = LIZIZ(i, LIZ2);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("content_source", LIZ(model));
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("to_status", LIZIZ2);
        c145995oB.LIZ(LIZ2 ? 1 : 0, "is_private");
        c145995oB.LJI("enter_method", "publishing");
        c145995oB.LJI("from_status", LIZIZ(i2, LIZ2));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c145995oB);
        }
        FMX.LJIIL("select_privacy_setting", c145995oB.LIZ);
    }
}
