package X;

import Y.ACListenerS46S0200000_12;
import Y.ACListenerS46S1100000_12;
import Y.AObserverS80S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes13.dex */
public abstract class T5F extends FrameLayout {
    public static final /* synthetic */ int LLFII = 0;
    public final String LJLIL;
    public LinearLayout LJLILLLLZI;
    public SmartImageView LJLJI;
    public TextView LJLJJI;
    public ViewStub LJLJJL;
    public View LJLJJLL;
    public ViewStub LJLJL;
    public View LJLJLJ;
    public RecyclerView LJLJLLL;
    public ViewStub LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public TextView LJLLJ;
    public RecyclerView LJLLL;
    public C90413gj LJLLLL;
    public FrameLayout LJLLLLLL;
    public SmartImageView LJLZ;
    public View LJZ;
    public final List<T5L> LJZI;
    public ChallengeDetail LJZL;
    public Challenge LL;
    public final T5H LLD;
    public ChallengeDetailViewModel LLF;
    public final AObserverS80S0100000_12 LLFF;
    public final MJC LLFFF;

    public void LIZIZ() {
    }

    public abstract int getAttrsResId();

    public abstract int getButtonResId();

    public abstract int getLayoutResId();

    public final void LIZLLL() {
        NextLiveData<OSZ<Integer, MH1>> nextLiveData;
        OSZ<Integer, MH1> value;
        MH1 second;
        ChallengeDetailViewModel challengeDetailViewModel = this.LLF;
        if (challengeDetailViewModel == null || (nextLiveData = challengeDetailViewModel.LJLILLLLZI) == null || (value = nextLiveData.getValue()) == null || (second = value.getSecond()) == null) {
            return;
        }
        List<Aweme> list = getMChallengeDetail().slideList;
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        if (second.LJLJJI == null) {
            second.LJLJJI = new ArrayList();
        }
        ((ArrayList) second.LJLJJI).clear();
        ((ArrayList) second.LJLJJI).addAll(list);
    }

    public final ChallengeDetailParam getDetailParam() {
        return this.LLD.LJI;
    }

    public final SmartImageView getMAvatar() {
        SmartImageView smartImageView = this.LJLJI;
        if (smartImageView != null) {
            return smartImageView;
        }
        o.LJIJI("mAvatar");
        throw null;
    }

    public final Challenge getMChallenge() {
        Challenge challenge = this.LL;
        if (challenge != null) {
            return challenge;
        }
        o.LJIJI("mChallenge");
        throw null;
    }

    public final ChallengeDetail getMChallengeDetail() {
        ChallengeDetail challengeDetail = this.LJZL;
        if (challengeDetail != null) {
            return challengeDetail;
        }
        o.LJIJI("mChallengeDetail");
        throw null;
    }

    public final ViewStub getMDescContainerVs() {
        ViewStub viewStub = this.LJLJJL;
        if (viewStub != null) {
            return viewStub;
        }
        o.LJIJI("mDescContainerVs");
        throw null;
    }

    public final LinearLayout getMHeaderContainer() {
        LinearLayout linearLayout = this.LJLILLLLZI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("mHeaderContainer");
        throw null;
    }

    public final TextView getMTitle() {
        TextView textView = this.LJLJJI;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("mTitle");
        throw null;
    }

    public void LIZJ() {
        View findViewById = findViewById(R.id.e3y);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.header_container)");
        setMHeaderContainer((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.avatar)");
        setMAvatar((SmartImageView) findViewById2);
        View findViewById3 = findViewById(R.id.title);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.title)");
        setMTitle((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.nf2);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.vs_desc_container)");
        setMDescContainerVs((ViewStub) findViewById4);
        View findViewById5 = findViewById(R.id.nfo);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.vs_related_container)");
        this.LJLJL = (ViewStub) findViewById5;
        View findViewById6 = findViewById(R.id.nfb);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.vs_horizontal_slide)");
        this.LJLL = (ViewStub) findViewById6;
        View findViewById7 = findViewById(R.id.arj);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.bottom_space)");
        this.LJZ = findViewById7;
        Iterator<T5L> it = this.LJZI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(this, this.LLD);
        }
    }

    public final ActivityC45651qj getActivity() {
        Activity LIZIZ = C27740Aue.LIZIZ(this);
        if (LIZIZ instanceof ActivityC45651qj) {
            return (ActivityC45651qj) LIZIZ;
        }
        return null;
    }

    public final int getAvatarContainerHight() {
        return getMAvatar().getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj activity = getActivity();
        o.LJI(activity);
        ChallengeDetailViewModel LIZ = C56532MGq.LIZ(activity);
        this.LLF = LIZ;
        o.LJI(LIZ);
        NextLiveData<OSZ<Integer, MH1>> nextLiveData = LIZ.LJLILLLLZI;
        ActivityC45651qj activity2 = getActivity();
        o.LJI(activity2);
        nextLiveData.observe(activity2, this.LLFF);
        LIZLLL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
        ChallengeDetailViewModel challengeDetailViewModel = this.LLF;
        o.LJI(challengeDetailViewModel);
        challengeDetailViewModel.LJLILLLLZI.removeObserver(this.LLFF);
        this.LLF = null;
        Iterator it = ((ArrayList) this.LJZI).iterator();
        while (it.hasNext()) {
            ((T5L) it.next()).LIZLLL();
        }
    }

    public final View getMDescContainer() {
        return this.LJLJJLL;
    }

    public final T5H getMHeaderParam() {
        return this.LLD;
    }

    public final ChallengeDetailViewModel getMViewModel() {
        return this.LLF;
    }

    @Override // android.view.View
    public final String getTag() {
        return this.LJLIL;
    }

    public void LIZ(ChallengeDetail challengeDetail) {
        int i;
        String str;
        String str2;
        Challenge challenge;
        List<String> list;
        View view;
        List<String> list2;
        String str3;
        View view2;
        if (challengeDetail.challenge == null) {
            return;
        }
        setMChallengeDetail(challengeDetail);
        Challenge challenge2 = challengeDetail.challenge;
        o.LJIIIIZZ(challenge2, "data.challenge");
        setMChallenge(challenge2);
        String challengeProfileUrl = getMChallenge().getChallengeProfileUrl();
        if (!TextUtils.isEmpty(challengeProfileUrl)) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(challengeProfileUrl);
            LJIIIIZZ.LIZIZ(this.LJLIL);
            LJIIIIZZ.LJJIIJ = getMAvatar();
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        C16880lQ.LJJIJLIJ(getMAvatar(), new ACListenerS46S1100000_12(this, challengeProfileUrl, 8));
        String challengeName = getMChallenge().getChallengeName();
        TextView mTitle = getMTitle();
        getMChallenge();
        getDetailParam().getCid();
        Boolean valueOf = Boolean.valueOf(getMChallenge().isCommerceAndValid());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "#");
        spannableStringBuilder.append((CharSequence) challengeName);
        if (((View) mTitle.getParent()).getLayoutDirection() == 1) {
            i = 5;
        } else {
            i = 3;
        }
        mTitle.setGravity(i);
        CommerceChallengeServiceImpl.LIZIZ().LJIJI(mTitle.getContext(), spannableStringBuilder.toString(), valueOf.booleanValue(), mTitle, true, "hashtag_homepage");
        ViewStub mDescContainerVs = getMDescContainerVs();
        if (this.LJLJJLL == null && mDescContainerVs != null) {
            C74065T4z c74065T4z = new C74065T4z();
            c74065T4z.LJI(mDescContainerVs);
            String desc = getMChallenge().getDesc();
            Challenge mChallenge = getMChallenge();
            if (mChallenge != null) {
                c74065T4z.LIZ(4, desc, new C8D0(c74065T4z, mChallenge));
            }
        }
        List<RelatedChallengeMusic> list3 = getMChallengeDetail().relatedChallengeMusicList;
        if (C79004UzY.LJJIFFI(list3)) {
            View view3 = this.LJLJLJ;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            ViewStub viewStub = this.LJLJL;
            if (viewStub != null) {
                if (this.LJLJLJ == null) {
                    View inflate = viewStub.inflate();
                    TextView textView = (TextView) inflate.findViewById(R.id.ct4);
                    o.LJI(textView);
                    textView.setText(textView.getContext().getText(R.string.g1o));
                    textView.setVisibility(0);
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.l0c);
                    this.LJLJLLL = recyclerView;
                    o.LJI(recyclerView);
                    final int LIZIZ = C04330Ez.LIZIZ(recyclerView.getContext(), R.color.cz);
                    final int LIZJ = (int) KL2.LIZJ(recyclerView.getContext(), 4.0f);
                    final float LIZJ2 = KL2.LIZJ(recyclerView.getContext(), 0.0f);
                    final float LIZJ3 = KL2.LIZJ(recyclerView.getContext(), 0.0f);
                    recyclerView.LJII(new AbstractC030309z(LIZJ2, LIZJ3, LIZIZ, LIZJ) { // from class: X.4mM
                        public final boolean LJLIL;
                        public final Paint LJLILLLLZI;
                        public final int LJLJI;
                        public final float LJLJJLL;
                        public final float LJLJL;
                        public final int LJLJJL = -1;
                        public final int LJLJJI = 0;

                        @Override // X.AbstractC030309z
                        public final void LJI(Canvas canvas, RecyclerView recyclerView2, C0AC c0ac) {
                            if (this.LJLJJI == 1) {
                                int measuredWidth = recyclerView2.getMeasuredWidth();
                                int childCount = recyclerView2.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    View childAt = recyclerView2.getChildAt(i2);
                                    int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
                                    int i3 = top - this.LJLJI;
                                    if (this.LJLIL) {
                                        canvas.drawRect(this.LJLJJLL + 0.0f, i3, measuredWidth - this.LJLJL, top, this.LJLILLLLZI);
                                    } else {
                                        float f = i3;
                                        float f2 = top;
                                        canvas.drawRect(0.0f, f, this.LJLJJLL, f2, this.LJLILLLLZI);
                                        float f3 = measuredWidth;
                                        canvas.drawRect(f3 - this.LJLJL, f, f3, f2, this.LJLILLLLZI);
                                    }
                                }
                                return;
                            }
                            int measuredHeight = recyclerView2.getMeasuredHeight();
                            int childCount2 = recyclerView2.getChildCount();
                            for (int i4 = 0; i4 < childCount2; i4++) {
                                View childAt2 = recyclerView2.getChildAt(i4);
                                int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).leftMargin;
                                int i5 = left - this.LJLJI;
                                if (this.LJLIL) {
                                    canvas.drawRect(i5, 0 + this.LJLJJLL, left, measuredHeight - this.LJLJL, this.LJLILLLLZI);
                                } else {
                                    float f4 = i5;
                                    float f5 = this.LJLJJLL;
                                    float f6 = left;
                                    canvas.drawRect(f4, f5 + 0.0f, f6, f5, this.LJLILLLLZI);
                                    float f7 = measuredHeight;
                                    canvas.drawRect(f4, f7 - this.LJLJL, f6, f7, this.LJLILLLLZI);
                                }
                            }
                        }

                        {
                            this.LJLJI = LIZJ;
                            Paint paint = new Paint(1);
                            this.LJLILLLLZI = paint;
                            paint.setColor(LIZIZ);
                            paint.setStyle(Paint.Style.FILL);
                            this.LJLJJLL = LIZJ2;
                            this.LJLJL = LIZJ3;
                            this.LJLIL = false;
                        }

                        @Override // X.AbstractC030309z
                        public final void LJ(Rect rect, View view4, RecyclerView recyclerView2, C0AC c0ac) {
                            int i2;
                            int i3;
                            recyclerView2.getClass();
                            int LJJJJIZL = RecyclerView.LJJJJIZL(view4);
                            if (this.LJLJJI == 1) {
                                if (LJJJJIZL == this.LJLJJL) {
                                    i3 = 0;
                                } else {
                                    i3 = this.LJLJI;
                                }
                                rect.set(0, 0, 0, i3);
                                return;
                            }
                            if (LJJJJIZL == this.LJLJJL) {
                                i2 = 0;
                            } else {
                                i2 = this.LJLJI;
                            }
                            rect.set(0, 0, i2, 0);
                        }
                    }, -1);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new WrapLinearLayoutManager(0));
                    this.LJLJLJ = inflate;
                }
                RecyclerView recyclerView2 = this.LJLJLLL;
                o.LJI(recyclerView2);
                recyclerView2.setAdapter(new C51618KNq(getContext(), getMChallenge().getCid(), list3));
                View view4 = this.LJLJLJ;
                o.LJI(view4);
                view4.setVisibility(0);
                View view5 = this.LJZ;
                if (view5 != null) {
                    view5.setVisibility(8);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    List<RelatedChallengeMusic> list4 = getMChallengeDetail().relatedChallengeMusicList;
                    o.LJIIIIZZ(list4, "mChallengeDetail.relatedChallengeMusicList");
                    for (RelatedChallengeMusic relatedChallengeMusic : list4) {
                        int i2 = relatedChallengeMusic.categoryType;
                        if (i2 == 1) {
                            Music music = relatedChallengeMusic.music;
                            if (music != null) {
                                sb.append(music.getMid());
                                sb.append(",");
                            }
                        } else if (i2 == 2 && (challenge = relatedChallengeMusic.challenge) != null) {
                            sb2.append(challenge.getCid());
                            sb2.append(",");
                        }
                    }
                    s.LJJZZI(sb, ",");
                    s.LJJZZI(sb2, ",");
                    if (TextUtils.equals(this.LLD.LJ, "from_related_tag")) {
                        str = getMChallenge().getCid();
                        o.LJIIIIZZ(str, "mChallenge.cid");
                        str2 = "1";
                    } else {
                        str = "";
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("level", str2);
                        jSONObject.put("enter_from", str);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("music", sb.toString());
                        jSONObject2.put("challenge", sb2.toString());
                        jSONObject.put("related", jSONObject2);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    MobClick LIZLLL = C1I1.LIZLLL("extend_challenge", "challenge");
                    LIZLLL.setValue(getMChallenge().getCid());
                    LIZLLL.setJsonObject(jSONObject);
                    FMX.onEvent(LIZLLL);
                } else {
                    o.LJIJI("mBottomSpace");
                    throw null;
                }
            } else {
                o.LJIJI("mRelatedContainerVs");
                throw null;
            }
        }
        if (TextUtils.isEmpty(getMChallengeDetail().slideTitle) || C79004UzY.LJJIFFI(getMChallengeDetail().slideList)) {
            View view6 = this.LJLLI;
            if (view6 != null) {
                view6.setVisibility(8);
            }
        } else {
            if (this.LJLLI == null) {
                ViewStub viewStub2 = this.LJLL;
                if (viewStub2 != null) {
                    View inflate2 = viewStub2.inflate();
                    this.LJLLILLLL = inflate2.findViewById(R.id.k4a);
                    this.LJLLJ = (TextView) inflate2.findViewById(R.id.k4j);
                    RecyclerView recyclerView3 = (RecyclerView) inflate2.findViewById(R.id.k4e);
                    this.LJLLL = recyclerView3;
                    o.LJI(recyclerView3);
                    getContext();
                    recyclerView3.setLayoutManager(new WrapLinearLayoutManager(0));
                    RecyclerView recyclerView4 = this.LJLLL;
                    o.LJI(recyclerView4);
                    recyclerView4.LJII(new AbstractC030309z() { // from class: X.3wI
                        @Override // X.AbstractC030309z
                        public final void LJ(Rect rect, View view7, RecyclerView recyclerView5, C0AC c0ac) {
                            int LIZJ4 = C1JX.LIZJ(rect, "outRect", view7, "view", recyclerView5, "parent", c0ac, "state", view7);
                            if (LIZJ4 == 0) {
                                rect.left = C17N.LJIILL(16.0d);
                            }
                            o.LJI(recyclerView5.getAdapter());
                            if (LIZJ4 == r0.getItemCount() - 1) {
                                rect.right = C17N.LJIILL(16.0d);
                            } else {
                                rect.right = C17N.LJIILL(4.0d);
                            }
                        }
                    }, -1);
                    this.LJLLLL = new C90413gj(this.LLFFF);
                    RecyclerView recyclerView5 = this.LJLLL;
                    o.LJI(recyclerView5);
                    recyclerView5.setAdapter(this.LJLLLL);
                    this.LJLLI = inflate2;
                } else {
                    o.LJIJI("mHorizontalSlideContainerVs");
                    throw null;
                }
            }
            if (getMChallenge().getMediaSource() == null && (view2 = this.LJLLILLLL) != null) {
                view2.setVisibility(0);
            }
            TextView textView2 = this.LJLLJ;
            o.LJI(textView2);
            textView2.setText(getMChallengeDetail().slideTitle);
            C90413gj c90413gj = this.LJLLLL;
            o.LJI(c90413gj);
            List<Aweme> list5 = getMChallengeDetail().slideList;
            if (!C79004UzY.LJJIFFI(list5)) {
                ((ArrayList) c90413gj.LJLILLLLZI).clear();
                List<Aweme> list6 = c90413gj.LJLILLLLZI;
                o.LJI(list5);
                ((ArrayList) list6).addAll(list5);
                c90413gj.notifyDataSetChanged();
            }
            View view7 = this.LJLLI;
            o.LJI(view7);
            view7.setVisibility(0);
            LIZLLL();
        }
        if (R3A.LJII()) {
            FestivalEntity LJI = R3A.LJI();
            if (LJI != null && LJI.mBannerDetail != null && (list2 = LJI.hashTagIds) != null && list2.contains(challengeDetail.challenge.getCid())) {
                this.LJLLLLLL = (FrameLayout) findViewById(R.id.p8);
                this.LJLZ = (SmartImageView) findViewById(R.id.p9);
                FrameLayout frameLayout = this.LJLLLLLL;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                SmartImageView smartImageView = this.LJLZ;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                W5F LJIIIIZZ2 = W5U.LJIIIIZZ(LJI.mBannerDetail.bannerResource);
                LJIIIIZZ2.LIZIZ("AbsCommonHeaderLayout");
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                S3I s3i = new S3I();
                s3i.LIZLLL = V2B.LJI(context, 2.0f);
                s3i.LIZIZ = V2B.LJI(context, 0.0f);
                LJIIIIZZ2.LJIJJLI = new S3L(s3i);
                LJIIIIZZ2.LJJIIJ = this.LJLZ;
                C16880lQ.LLJJJ(LJIIIIZZ2);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "tag_page");
                if (R3A.LJI() == null || R3A.LJI().activityType == 0) {
                    str3 = "donation";
                } else {
                    str3 = "lottery";
                }
                c188727au.LJIIIZ("gen", str3);
                c188727au.LJIIIZ("tag_id", challengeDetail.challenge.getCid());
                FMX.LJIIL("xmas_banner_show", c188727au.LIZ);
                FrameLayout frameLayout2 = this.LJLLLLLL;
                if (frameLayout2 != null) {
                    C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS46S0200000_12(this, LJI, 42));
                }
            }
        } else {
            FestivalEntity LJI2 = R3A.LJI();
            if (LJI2 != null && (list = LJI2.hashTagIds) != null && list.contains(challengeDetail.challenge.getCid()) && (view = this.LJLJJLL) != null) {
                view.setVisibility(8);
            }
            this.LJLZ = (SmartImageView) findViewById(R.id.p9);
            FrameLayout frameLayout3 = this.LJLLLLLL;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
        }
        Iterator it = ((ArrayList) this.LJZI).iterator();
        while (it.hasNext()) {
            ((T5L) it.next()).LIZIZ(challengeDetail);
        }
        FRW.LIZJ("cd_start_activity_to_show_header_duration");
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("challenge", event.LJLJJI)) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(getContext(), getMAvatar(), event);
        }
    }

    public final void setHeaderAlpha(float f) {
        getMHeaderContainer().setAlpha(1 - f);
        Iterator<T5L> it = this.LJZI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(f);
        }
    }

    public final void setMAvatar(SmartImageView smartImageView) {
        o.LJIIIZ(smartImageView, "<set-?>");
        this.LJLJI = smartImageView;
    }

    public final void setMChallenge(Challenge challenge) {
        o.LJIIIZ(challenge, "<set-?>");
        this.LL = challenge;
    }

    public final void setMChallengeDetail(ChallengeDetail challengeDetail) {
        o.LJIIIZ(challengeDetail, "<set-?>");
        this.LJZL = challengeDetail;
    }

    public final void setMDescContainer(View view) {
        this.LJLJJLL = view;
    }

    public final void setMDescContainerVs(ViewStub viewStub) {
        o.LJIIIZ(viewStub, "<set-?>");
        this.LJLJJL = viewStub;
    }

    public final void setMHeaderContainer(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLILLLLZI = linearLayout;
    }

    public final void setMTitle(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLJJI = textView;
    }

    public final void setMViewModel(ChallengeDetailViewModel challengeDetailViewModel) {
        this.LLF = challengeDetailViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5F(Context context, T5H t5h, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = "AbsCommonHeaderView";
        this.LJZI = new ArrayList();
        o.LJI(t5h);
        this.LLD = t5h;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayoutResId(), this, true);
        LIZIZ();
        LIZJ();
        this.LLFF = new AObserverS80S0100000_12(this, 87);
        this.LLFFF = new MJC(this);
    }
}
