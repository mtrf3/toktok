package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JOa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49080JOa extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchCLASubtitleAssem, C43I<? extends C90U>, C76800UCe> {
    public static final C49080JOa LJLIL = new C49080JOa();

    public C49080JOa() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchCLASubtitleAssem searchCLASubtitleAssem, C43I<? extends C90U> c43i) {
        String str;
        boolean z;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        C90U c90u;
        String str3;
        String str4;
        Integer num;
        int i;
        long j;
        int i2;
        Integer num2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C90U c90u2;
        InterfaceC46330IGg playerManager;
        C90U c90u3;
        String str10;
        C90U c90u4;
        C90U c90u5;
        C90U c90u6;
        SearchCLASubtitleAssem selectSubscribe = searchCLASubtitleAssem;
        C43I<? extends C90U> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c90u6 = (C90U) c43i2.LIZ) != null) {
            str = c90u6.LIZLLL;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (c43i2 != null && (c90u5 = (C90U) c43i2.LIZ) != null) {
                str2 = c90u5.LIZLLL;
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, " ")) {
                JJR jjr = selectSubscribe.LLFF;
                if (jjr != null) {
                    if (jjr.getState() != EnumC48742JBa.CLOSED) {
                        if (c43i2 != null && (c90u3 = (C90U) c43i2.LIZ) != null && (str10 = c90u3.LIZLLL) != null && str10.length() - 1 > 0 && str10.charAt(str10.length() - 1) == ' ' && (c90u4 = (C90U) c43i2.LIZ) != null) {
                            c90u4.LIZLLL = str10.subSequence(0, str10.length() - 1).toString();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (selectSubscribe.LLFII > currentTimeMillis) {
                            ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), ISearchVideoHolderAbility.class, null);
                            if (iSearchVideoHolderAbility != null && (playerManager = iSearchVideoHolderAbility.getPlayerManager()) != null) {
                                j = playerManager.getCurrentPosition();
                            } else {
                                j = 0;
                            }
                            SearchCLASubtitleVM Z3 = selectSubscribe.Z3();
                            JQA jqa = selectSubscribe.b4().LJLJI;
                            Aweme aweme = ((C49105JOz) C51029K0z.LJIILLIIL(selectSubscribe)).LJLIL;
                            boolean z2 = selectSubscribe.a4().LJLILLLLZI;
                            boolean LIZ = C48207Ivz.LIZ(selectSubscribe.getContext());
                            if (c43i2 != null && (c90u2 = (C90U) c43i2.LIZ) != null) {
                                i2 = c90u2.LIZIZ;
                            } else {
                                i2 = 0;
                            }
                            Z3.getClass();
                            o.LJIIIZ(aweme, "aweme");
                            C188727au c188727au = new C188727au();
                            Video video = aweme.getVideo();
                            if (video != null) {
                                num2 = Integer.valueOf(video.getDuration());
                            } else {
                                num2 = null;
                            }
                            c188727au.LJFF(num2, "duration");
                            c188727au.LIZLLL(i2, "fst_caption_expect_display_time");
                            long j2 = j - i2;
                            long j3 = 0;
                            if (j2 >= 0) {
                                j3 = j2;
                            }
                            c188727au.LJ(j3, "fst_caption_display_delay");
                            c188727au.LJIIIZ("group_id", aweme.getAid());
                            if (LIZ) {
                                str5 = "1";
                            } else {
                                str5 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c188727au.LJIIIZ("is_wifi", str5);
                            CaptionLanguage LIZ2 = C50560Jsq.LIZ(aweme);
                            if (LIZ2 != null) {
                                str6 = LIZ2.getLanguageCode();
                            } else {
                                str6 = null;
                            }
                            c188727au.LJIIIZ("origin_language", str6);
                            if (z2) {
                                str7 = C50560Jsq.LIZJ();
                            } else {
                                CaptionLanguage LIZ3 = C50560Jsq.LIZ(aweme);
                                if (LIZ3 != null) {
                                    str7 = LIZ3.getLanguageCode();
                                } else {
                                    str7 = null;
                                }
                            }
                            c188727au.LJIIIZ("trans_language", str7);
                            c188727au.LJIIIZ("enter_from", "general_search");
                            if (jqa != null) {
                                str8 = jqa.LJII;
                            } else {
                                str8 = null;
                            }
                            c188727au.LJIIIZ("search_id", str8);
                            if (jqa != null) {
                                str9 = jqa.LJ;
                            } else {
                                str9 = null;
                            }
                            c188727au.LJIIIZ("search_keyword", str9);
                            FMX.LJIIL("search_cla_caption_load_time", c188727au.LIZ);
                        }
                        JJR jjr2 = selectSubscribe.LLFF;
                        if (jjr2 != null) {
                            if (c43i2 == null || (c90u = (C90U) c43i2.LIZ) == null || (str3 = c90u.LIZLLL) == null || str3.length() == 0 || selectSubscribe.getContext() == null) {
                                spannableStringBuilder = new SpannableStringBuilder("");
                            } else {
                                spannableStringBuilder = new SpannableStringBuilder();
                                if (c90u != null) {
                                    str4 = c90u.LIZLLL;
                                } else {
                                    str4 = null;
                                }
                                T5R t5r = new T5R(str4);
                                t5r.LIZ(62);
                                Context context = selectSubscribe.getContext();
                                if (context != null) {
                                    num = C79045V0n.LJI(R.attr.dj, context);
                                } else {
                                    num = null;
                                }
                                if (str4 != null) {
                                    i = str4.length();
                                } else {
                                    i = 0;
                                }
                                t5r.setSpan(num, 0, i, 33);
                                spannableStringBuilder.append((CharSequence) str4);
                            }
                            jjr2.setText(spannableStringBuilder);
                            selectSubscribe.LLFII = currentTimeMillis;
                        } else {
                            o.LJIJI("subtitleView");
                            throw null;
                        }
                    }
                    return C76800UCe.LIZ;
                }
                o.LJIJI("subtitleView");
                throw null;
            }
        }
        JJR jjr3 = selectSubscribe.LLFF;
        if (jjr3 != null) {
            jjr3.setText("");
            return C76800UCe.LIZ;
        }
        o.LJIJI("subtitleView");
        throw null;
    }
}
