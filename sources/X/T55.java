package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.ss.android.ugc.aweme.discover.model.InquiryStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import java.util.List;
import kotlin.jvm.internal.o;
import o53.IDdS476S0100000_10;

/* loaded from: classes13.dex */
public final class T55 implements T5K {
    public static final /* synthetic */ int LJIJJLI = 0;
    public View LIZ;
    public T5P LIZIZ;
    public TextView LIZJ;
    public ViewStub LIZLLL;
    public TextView LJ;
    public View LJFF;
    public C62186Oas LJI;
    public ViewStub LJII;
    public View LJIIIIZZ;
    public TextView LJIIIZ;
    public View LJIIJ;
    public TextView LJIIJJI;
    public ViewStub LJIIL;
    public View LJIILIIL;
    public ViewStub LJIILJJIL;
    public View LJIILL;
    public TextView LJIILLIIL;
    public Context LJIIZILJ;
    public C232669Be LJIJ;
    public Challenge LJIJI;
    public List<? extends Aweme> LJIJJ;

    @Override // X.T5K
    public final void LIZ(float f) {
        boolean z;
        TextView textView = this.LJIIIZ;
        if (textView == null) {
            return;
        }
        if (f <= 0.9d) {
            z = true;
        } else {
            z = false;
        }
        textView.setClickable(z);
    }

    @Override // X.T5K
    public final void LIZIZ(ViewStub viewStub) {
        this.LJIILJJIL = viewStub;
        if (viewStub == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.vn);
    }

    @Override // X.T5K
    public final void LIZLLL(View view) {
        this.LIZ = view;
    }

    @Override // X.T5K
    public final void LJFF(ViewStub viewStub) {
        this.LIZLLL = viewStub;
        if (viewStub == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.vt);
    }

    @Override // X.T5K
    public final void LJII(ViewStub viewStub) {
        this.LJII = viewStub;
        if (viewStub == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.vm);
    }

    @Override // X.T5K
    public final void LJIIIIZZ(TextView textView) {
        this.LIZJ = textView;
    }

    @Override // X.T5K
    public final void LJIIIZ(T5P t5p) {
        this.LIZIZ = t5p;
    }

    public final void LJIIJ(String str) {
        C188727au c188727au = new C188727au();
        Challenge challenge = this.LJIJI;
        if (challenge != null) {
            c188727au.LJIIIZ("tag_id", challenge.getCid());
            c188727au.LJIIIZ("enter_from", "challenge");
            FMX.LJIIL(str, c188727au.LIZ);
            return;
        }
        o.LJIJI("mChallenge");
        throw null;
    }

    public final void LJIIJJI(String str) {
        String str2;
        MobClick LIZLLL = C1I1.LIZLLL(str, "challenge");
        Challenge challenge = this.LJIJI;
        if (challenge != null) {
            LIZLLL.setValue(challenge.getCid());
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("link_type", "web_link");
            LIZLLL.setJsonObject(c198517qh.LJ());
            FMX.onEvent(LIZLLL);
            Challenge challenge2 = this.LJIJI;
            if (challenge2 != null) {
                User author = challenge2.getAuthor();
                if (author != null) {
                    str2 = author.getUid();
                } else {
                    str2 = "";
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("author_id", str2);
                Challenge challenge3 = this.LJIJI;
                if (challenge3 != null) {
                    c188727au.LJIIIZ("tag_id", challenge3.getCid());
                    c188727au.LJIIIZ("link_type", "web_link");
                    c188727au.LJIIIZ("enter_from", "challenge");
                    FMX.LJIIL(str, c188727au.LIZ);
                    return;
                }
                o.LJIJI("mChallenge");
                throw null;
            }
            o.LJIJI("mChallenge");
            throw null;
        }
        o.LJIJI("mChallenge");
        throw null;
    }

    @Override // X.T5K
    public final void LIZJ(FrameLayout root, C232669Be c232669Be) {
        o.LJIIIZ(root, "root");
        Context context = root.getContext();
        o.LJIIIIZZ(context, "root.context");
        this.LJIIZILJ = context;
        this.LJIJ = c232669Be;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.T5K
    public final void LJ(Challenge challenge, List list) {
        String openUrl;
        String webUrl;
        String desc;
        boolean z;
        String content;
        int i;
        boolean z2;
        int i2;
        String title;
        Context context;
        int i3;
        View view;
        ViewGroup.LayoutParams layoutParams;
        C62186Oas c62186Oas;
        o.LJIIIZ(challenge, "challenge");
        this.LJIJI = challenge;
        this.LJIJJ = list;
        InquiryStruct inquiryStruct = challenge.inquiryStruct;
        if (inquiryStruct == null || ((((openUrl = inquiryStruct.getOpenUrl()) == null || openUrl.length() == 0) && ((webUrl = inquiryStruct.getWebUrl()) == null || webUrl.length() == 0)) || (desc = inquiryStruct.getDesc()) == null || desc.length() == 0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view2 = this.LIZ;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            Challenge challenge2 = this.LJIJI;
            if (challenge2 != null) {
                InquiryStruct inquiryStruct2 = challenge2.inquiryStruct;
                if (inquiryStruct2 != null) {
                    String desc2 = inquiryStruct2.getDesc();
                    String openUrl2 = inquiryStruct2.getOpenUrl();
                    String webUrl2 = inquiryStruct2.getWebUrl();
                    if (inquiryStruct2.getIcon() == null) {
                        T5P t5p = this.LIZIZ;
                        if (t5p != null) {
                            t5p.setVisibility(8);
                        }
                    } else {
                        C78765Uvh.LJFF(this.LIZIZ, inquiryStruct2.getIcon());
                    }
                    TextView textView = this.LIZJ;
                    if (textView != null) {
                        textView.setText(desc2);
                    }
                    View view3 = this.LIZ;
                    if (view3 != null) {
                        C16880lQ.LJIIJ(new T56(this, openUrl2, webUrl2), view3);
                    }
                    View view4 = this.LIZ;
                    if (view4 != null) {
                        view4.setVisibility(0);
                    }
                }
            } else {
                o.LJIJI("mChallenge");
                throw null;
            }
        }
        Challenge challenge3 = this.LJIJI;
        if (challenge3 != null) {
            if (challenge3.getHtcMissionModule() == null) {
                View view5 = this.LJIILIIL;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            } else {
                View view6 = this.LJIILIIL;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
                ViewStub viewStub = this.LJIIL;
                if (this.LJIILIIL == null && viewStub != null) {
                    View inflate = viewStub.inflate();
                    ICommerceMissionService LJIIIIZZ = CommerceMissionServiceImpl.LJIIIIZZ();
                    o.LJIIIIZZ(inflate, "this");
                    Challenge challenge4 = this.LJIJI;
                    if (challenge4 != null) {
                        LJIIIIZZ.LIZJ(inflate, challenge4.getHtcMissionModule(), E3X.HTC, new T57(this));
                        this.LJIILIIL = inflate;
                    } else {
                        o.LJIJI("mChallenge");
                        throw null;
                    }
                }
            }
            Challenge challenge5 = this.LJIJI;
            if (challenge5 != null) {
                int i4 = 5;
                if (!SS3.LJ(challenge5)) {
                    View view7 = this.LJIILL;
                    if (view7 != null) {
                        view7.setVisibility(8);
                    }
                } else {
                    ViewStub viewStub2 = this.LJIILJJIL;
                    if (this.LJIILL == null && viewStub2 != null) {
                        View inflate2 = viewStub2.inflate();
                        this.LJIILLIIL = (TextView) inflate2.findViewById(R.id.bn8);
                        this.LJ = (TextView) inflate2.findViewById(R.id.bn7);
                        this.LJIILL = inflate2;
                    }
                    TextView textView2 = this.LJIILLIIL;
                    String str = "";
                    if (textView2 != null) {
                        Challenge challenge6 = this.LJIJI;
                        if (challenge6 != null) {
                            if (!SS3.LJ(challenge6)) {
                                title = "";
                            } else {
                                title = challenge6.getChallengeDisclaimer().getTitle();
                            }
                            textView2.setText(title);
                        } else {
                            o.LJIJI("mChallenge");
                            throw null;
                        }
                    }
                    Challenge challenge7 = this.LJIJI;
                    if (challenge7 != null) {
                        if (!SS3.LJ(challenge7)) {
                            content = "";
                        } else {
                            content = challenge7.getChallengeDisclaimer().getContent();
                            o.LJIIIIZZ(content, "challenge.challengeDisclaimer.content");
                        }
                        TextView textView3 = this.LJ;
                        if (textView3 == null) {
                            z2 = 0;
                        } else {
                            if (C90193gN.LIZIZ(textView3.getContext())) {
                                i = -1;
                            } else {
                                i = -2;
                            }
                            z2 = new Bidi(content, i).baseIsLeftToRight();
                        }
                        TextView textView4 = this.LJ;
                        if (textView4 != null) {
                            if (z2 != 0) {
                                i2 = 3;
                            } else {
                                i2 = 5;
                            }
                            textView4.setGravity(i2);
                        }
                        TextView textView5 = this.LJ;
                        if (textView5 != null) {
                            textView5.setTextDirection(!z2);
                        }
                        TextView textView6 = this.LJ;
                        if (textView6 != null) {
                            Challenge challenge8 = this.LJIJI;
                            if (challenge8 != null) {
                                if (SS3.LJ(challenge8)) {
                                    str = challenge8.getChallengeDisclaimer().getContent();
                                    o.LJIIIIZZ(str, "challenge.challengeDisclaimer.content");
                                }
                                textView6.setText(str);
                            } else {
                                o.LJIJI("mChallenge");
                                throw null;
                            }
                        }
                        View view8 = this.LJIILL;
                        if (view8 != null) {
                            view8.setVisibility(0);
                        }
                    } else {
                        o.LJIJI("mChallenge");
                        throw null;
                    }
                }
                View view9 = this.LJFF;
                if (view9 != null) {
                    view9.setVisibility(8);
                }
                Challenge challenge9 = this.LJIJI;
                if (challenge9 != null) {
                    List<CommerceChallengeBanner> list2 = challenge9.commerceChallengeBannerList;
                    if (list2 != null && (!list2.isEmpty())) {
                        ViewStub viewStub3 = this.LIZLLL;
                        if (this.LJFF == null && viewStub3 != null) {
                            View inflate3 = viewStub3.inflate();
                            this.LJI = (C62186Oas) inflate3.findViewById(R.id.bms);
                            this.LJFF = inflate3;
                        }
                        CommerceChallengeBanner commerceChallengeBanner = (CommerceChallengeBanner) ListProtector.get(list2, 0);
                        Context context2 = this.LJIIZILJ;
                        if (context2 != null) {
                            int LJIIIIZZ2 = C60996Nwm.LJIIIIZZ(context2) - C17N.LJIILL(32.0d);
                            C62186Oas c62186Oas2 = this.LJI;
                            if (c62186Oas2 != null) {
                                layoutParams = c62186Oas2.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.width = LJIIIIZZ2;
                                }
                            } else {
                                layoutParams = null;
                            }
                            C62186Oas c62186Oas3 = this.LJI;
                            if (c62186Oas3 != null) {
                                c62186Oas3.setLayoutParams(layoutParams);
                            }
                            if (!C79004UzY.LJJIFFI(commerceChallengeBanner.getIcon().getUrlList()) && (c62186Oas = this.LJI) != null) {
                                c62186Oas.setImageURI((String) ListProtector.get(commerceChallengeBanner.getIcon().getUrlList(), 0), new IDdS476S0100000_10(this, 7));
                            }
                            C62186Oas c62186Oas4 = this.LJI;
                            if (c62186Oas4 != null) {
                                c62186Oas4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, commerceChallengeBanner, 19)));
                            }
                            View view10 = this.LJFF;
                            if (view10 != null) {
                                view10.setVisibility(0);
                            }
                            LJIIJ("banner_show");
                        } else {
                            o.LJIJI("mContext");
                            throw null;
                        }
                    }
                    Challenge challenge10 = this.LJIJI;
                    if (challenge10 != null) {
                        if (!SS3.LIZJ(challenge10)) {
                            Challenge challenge11 = this.LJIJI;
                            if (challenge11 != null) {
                                if (!SS3.LIZLLL(challenge11)) {
                                    View view11 = this.LJIIIIZZ;
                                    if (view11 == null) {
                                        return;
                                    }
                                    view11.setVisibility(8);
                                    return;
                                }
                            } else {
                                o.LJIJI("mChallenge");
                                throw null;
                            }
                        }
                        ViewStub viewStub4 = this.LJII;
                        if (this.LJIIIIZZ == null && viewStub4 != null) {
                            View inflate4 = viewStub4.inflate();
                            this.LJIIIZ = (TextView) inflate4.findViewById(R.id.ftm);
                            this.LJIIJ = inflate4.findViewById(R.id.k83);
                            this.LJIIJJI = (TextView) inflate4.findViewById(R.id.j9_);
                            this.LJIIIIZZ = inflate4;
                        }
                        Challenge challenge12 = this.LJIJI;
                        if (challenge12 != null) {
                            if (SS3.LIZJ(challenge12)) {
                                Challenge challenge13 = this.LJIJI;
                                if (challenge13 != null) {
                                    if (SS3.LIZLLL(challenge13) && (view = this.LJIIJ) != null) {
                                        view.setVisibility(0);
                                    }
                                } else {
                                    o.LJIJI("mChallenge");
                                    throw null;
                                }
                            }
                            TextView textView7 = this.LJIIIZ;
                            if (textView7 != null) {
                                context = textView7.getContext();
                            } else {
                                context = null;
                            }
                            boolean LIZIZ = C90193gN.LIZIZ(context);
                            Challenge challenge14 = this.LJIJI;
                            if (challenge14 != null) {
                                if (SS3.LIZLLL(challenge14)) {
                                    TextView textView8 = this.LJIIJJI;
                                    if (textView8 != null) {
                                        Challenge challenge15 = this.LJIJI;
                                        if (challenge15 != null) {
                                            textView8.setText(challenge15.getRuleDetailDesc());
                                        } else {
                                            o.LJIJI("mChallenge");
                                            throw null;
                                        }
                                    }
                                    TextView textView9 = this.LJIIJJI;
                                    if (textView9 != null) {
                                        if (LIZIZ) {
                                            i3 = 5;
                                        } else {
                                            i3 = 3;
                                        }
                                        textView9.setGravity(i3);
                                    }
                                    TextView textView10 = this.LJIIJJI;
                                    if (textView10 != null) {
                                        textView10.setTextDirection(LIZIZ ? 1 : 0);
                                    }
                                    Challenge challenge16 = this.LJIJI;
                                    if (challenge16 != null) {
                                        String url = challenge16.getRuleDetailUrl();
                                        T58 LIZ = NTK.LIZ();
                                        if (LIZ != null) {
                                            Context context3 = this.LJIIZILJ;
                                            if (context3 != null) {
                                                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
                                                o.LJI(LJJIFFI);
                                                o.LJIIIIZZ(url, "url");
                                                LIZ.LIZLLL(LJJIFFI, url);
                                            } else {
                                                o.LJIJI("mContext");
                                                throw null;
                                            }
                                        }
                                        TextView textView11 = this.LJIIJJI;
                                        if (textView11 != null) {
                                            C16880lQ.LJIJI(textView11, new ACListenerS32S0100000_12(this, 103));
                                        }
                                        TextView textView12 = this.LJIIJJI;
                                        if (textView12 != null) {
                                            textView12.setVisibility(0);
                                        }
                                    } else {
                                        o.LJIJI("mChallenge");
                                        throw null;
                                    }
                                }
                                Challenge challenge17 = this.LJIJI;
                                if (challenge17 != null) {
                                    if (SS3.LIZJ(challenge17)) {
                                        TextView textView13 = this.LJIIIZ;
                                        if (textView13 != null) {
                                            Challenge challenge18 = this.LJIJI;
                                            if (challenge18 != null) {
                                                textView13.setText(challenge18.getLinkText());
                                            } else {
                                                o.LJIJI("mChallenge");
                                                throw null;
                                            }
                                        }
                                        TextView textView14 = this.LJIIIZ;
                                        if (textView14 != null) {
                                            if (!LIZIZ) {
                                                i4 = 3;
                                            }
                                            textView14.setGravity(i4);
                                        }
                                        TextView textView15 = this.LJIIIZ;
                                        if (textView15 != null) {
                                            textView15.setTextDirection(LIZIZ ? 1 : 0);
                                        }
                                        TextView textView16 = this.LJIIIZ;
                                        if (textView16 != null) {
                                            C16880lQ.LJIJI(textView16, new ACListenerS32S0100000_12(this, 104));
                                        }
                                        TextView textView17 = this.LJIIIZ;
                                        if (textView17 != null) {
                                            textView17.setVisibility(0);
                                        }
                                        LJIIJJI("show_link");
                                    }
                                    View view12 = this.LJIIIIZZ;
                                    if (view12 == null) {
                                        return;
                                    }
                                    view12.setVisibility(0);
                                    return;
                                }
                                o.LJIJI("mChallenge");
                                throw null;
                            }
                            o.LJIJI("mChallenge");
                            throw null;
                        }
                        o.LJIJI("mChallenge");
                        throw null;
                    }
                    o.LJIJI("mChallenge");
                    throw null;
                }
                o.LJIJI("mChallenge");
                throw null;
            }
            o.LJIJI("mChallenge");
            throw null;
        }
        o.LJIJI("mChallenge");
        throw null;
    }

    @Override // X.T5K
    public final void LJI(ViewStub viewStub, int i) {
        this.LJIIL = viewStub;
        if (viewStub == null) {
            return;
        }
        viewStub.setLayoutResource(i);
    }
}
