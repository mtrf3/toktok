package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.AJ9;
import X.AV1;
import X.C05040Hs;
import X.C1JX;
import X.C2068389v;
import X.C26338AVi;
import X.C38995FSd;
import X.C49098JOs;
import X.C49380JZo;
import X.C49421JaT;
import X.C49448Jau;
import X.C50420Jqa;
import X.C54840Lfg;
import X.C72434Sbm;
import X.C72972SkS;
import X.C77123UOp;
import X.C78847Ux1;
import X.C79043V0l;
import X.C8FR;
import X.C8XO;
import X.C97N;
import X.InterfaceC49000JKy;
import X.J7H;
import X.JKV;
import X.JKY;
import X.QD3;
import X.SY9;
import X.V1B;
import X.W5F;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public class SearchCardBottomBarAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements C8XO<InterfaceC49000JKy> {
    public final JKY LLFF;
    public C49448Jau LLFFF;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public C72434Sbm LLI;
    public ImageView LLIFFJFJJ;
    public TuxTextView LLII;
    public TuxTextView LLIIII;
    public View LLIIIILZ;
    public Aweme LLIIIJ;
    public boolean LLIIIL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cfd;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardBottomBarAssem() {
        new LinkedHashMap();
        this.LLFF = JKY.NONE;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        if (this.LLIIIL) {
            EventBus.LIZJ().LJIJ(this);
            this.LLIIIL = false;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (!this.LLIIIL) {
            EventBus.LIZJ().LJIILJJIL(this);
            this.LLIIIL = true;
        }
    }

    public JKY n4() {
        return this.LLFF;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49000JKy interfaceC49000JKy) {
        TuxTextView tuxTextView;
        String desc;
        boolean z;
        boolean z2;
        SpannableString spannableString;
        int i;
        List<TextExtraStruct> textExtra;
        Context context;
        TuxTextView tuxTextView2;
        int i2;
        String userCountDes;
        String totalUserDes;
        TopFrameSummary topFrameSummary;
        TuxTextView tuxTextView3;
        String nickname;
        InterfaceC49000JKy item = interfaceC49000JKy;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        this.LLIIIJ = aweme;
        boolean z3 = true;
        String str = "";
        if (aweme != null && (tuxTextView = this.LLFII) != null) {
            if (aweme.isLive()) {
                User author = aweme.getAuthor();
                if (author != null) {
                    desc = author.getRoomTitle();
                } else {
                    desc = null;
                }
            } else {
                desc = aweme.getDesc();
            }
            if (TextUtils.isEmpty(desc)) {
                tuxTextView.setText("");
                tuxTextView.setVisibility(8);
            } else {
                tuxTextView.setVisibility(0);
                List<TextExtraStruct> textExtra2 = aweme.getTextExtra();
                if (aweme.getTextExtra() != null && ((textExtra = aweme.getTextExtra()) == null || !textExtra.isEmpty())) {
                    Iterator<TextExtraStruct> it = aweme.getTextExtra().iterator();
                    while (it.hasNext()) {
                        if (it.next().isCommerce()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
                    if (z) {
                        ICommerceChallengeService LIZIZ = CommerceChallengeServiceImpl.LIZIZ();
                        Aweme aweme2 = this.LLIIIJ;
                        LIZIZ.LJIJJLI(aweme2);
                        this.LLIIIJ = aweme2;
                    }
                } else {
                    ICommerceChallengeService LIZIZ2 = CommerceChallengeServiceImpl.LIZIZ();
                    Aweme aweme3 = this.LLIIIJ;
                    LIZIZ2.LJIJJLI(aweme3);
                    this.LLIIIJ = aweme3;
                }
                if (JKV.LIZ == 1) {
                    z2 = true;
                    Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.go);
                    if (LIZJ != null) {
                        i = LIZJ.intValue();
                    } else {
                        i = 0;
                    }
                    tuxTextView.setTextColor(i);
                    tuxTextView.setTuxFont(41);
                } else {
                    z2 = false;
                }
                if (!TextUtils.isEmpty(aweme.getSearchDesc())) {
                    if (z2 && aweme.getHighlightInfoList() != null) {
                        C49448Jau c49448Jau = this.LLFFF;
                        if (c49448Jau != null) {
                            String searchDesc = aweme.getSearchDesc();
                            o.LJIIIIZZ(searchDesc, "validAweme.searchDesc");
                            spannableString = new SpannableString(searchDesc);
                            c49448Jau.LIZ(spannableString, "search_desc", 0);
                        } else {
                            spannableString = new SpannableString(aweme.getSearchDesc());
                        }
                    } else {
                        spannableString = new SpannableString(aweme.getSearchDesc());
                    }
                } else {
                    spannableString = new SpannableString(desc);
                }
                tuxTextView.setText(spannableString);
                TuxTextView tuxTextView4 = this.LLFII;
                if (tuxTextView4 != null) {
                    if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
                        if (z) {
                            CommerceChallengeServiceImpl.LIZIZ().LJIIJJI(tuxTextView4, this.LLIIIJ, spannableString);
                        }
                    } else {
                        CommerceChallengeServiceImpl.LIZIZ().LJIIJJI(tuxTextView4, this.LLIIIJ, spannableString);
                    }
                }
                aweme.setTextExtra(textExtra2);
                tuxTextView.setMaxLines(2);
            }
        }
        Aweme aweme4 = this.LLIIIJ;
        if (aweme4 != null) {
            User author2 = aweme4.getAuthor();
            if (author2 != null && (tuxTextView3 = this.LLFZ) != null) {
                if (AV1.LJIJJLI(author2)) {
                    nickname = author2.getUniqueId();
                } else {
                    nickname = author2.getNickname();
                }
                tuxTextView3.setText(nickname);
            }
            User author3 = aweme4.getAuthor();
            if (author3 != null) {
                if (AJ9.LIZIZ(new UserVerify(null, author3.getCustomVerify(), author3.getEnterpriseVerifyReason(), -1))) {
                    ImageView imageView = this.LLIFFJFJJ;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                } else {
                    ImageView imageView2 = this.LLIFFJFJJ;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                }
            }
            User author4 = aweme4.getAuthor();
            if (author4 != null) {
                if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZIZ.getValue()).videoImageAsyncLoad) {
                    C38995FSd.LIZJ().execute(new ARunnableS27S0200000_8(this, author4, 98));
                } else {
                    W5F LJI = C1JX.LJI(author4);
                    LJI.LJIILIIL(J7H.LIZ(100));
                    LJI.LIZIZ("SearchCardBottomAssem");
                    LJI.LJJIIJ = this.LLI;
                    LJI.LJ();
                }
            }
        }
        m4(this.LLIIIJ);
        Aweme aweme5 = this.LLIIIJ;
        if (aweme5 == null || (context = getContext()) == null || n4() != JKY.WATCH_COUNT || (tuxTextView2 = this.LLIIII) == null) {
            return;
        }
        tuxTextView2.setVisibility(0);
        C2068389v c2068389v = new C2068389v();
        C97N.LIZ.getClass();
        if (C97N.LIZ()) {
            i2 = R.raw.icon_person;
        } else {
            i2 = R.raw.icon_person_bold;
        }
        c2068389v.LIZ = i2;
        c2068389v.LJ = Integer.valueOf(R.attr.gx);
        float f = 14;
        c2068389v.LIZJ = C05040Hs.LIZ(1, f);
        c2068389v.LIZIZ = C05040Hs.LIZ(1, f);
        SY9 LIZ = c2068389v.LIZ(context);
        if (!C26338AVi.LIZJ(context)) {
            tuxTextView2.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            tuxTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ, (Drawable) null);
        }
        LiveRoomStruct newLiveRoomData = aweme5.getNewLiveRoomData();
        if (newLiveRoomData != null && (totalUserDes = newLiveRoomData.getTotalUserDes()) != null) {
            LiveRoomStruct newLiveRoomData2 = aweme5.getNewLiveRoomData();
            if (newLiveRoomData2 == null || (topFrameSummary = newLiveRoomData2.topFrameSummary) == null || topFrameSummary.getId() == 0) {
                z3 = false;
            }
            if (Boolean.valueOf(z3).booleanValue()) {
                str = totalUserDes;
                tuxTextView2.setText(str);
            }
        }
        LiveRoomStruct newLiveRoomData3 = aweme5.getNewLiveRoomData();
        if (newLiveRoomData3 != null && (userCountDes = newLiveRoomData3.getUserCountDes()) != null) {
            str = userCountDes;
        }
        tuxTextView2.setText(str);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49000JKy interfaceC49000JKy) {
        return true;
    }

    public final void m4(Aweme aweme) {
        Long l;
        int i;
        int i2;
        Integer valueOf;
        long j;
        SpannableStringBuilder spannableStringBuilder;
        if (aweme != null && n4() == JKY.LIEK_COUNT) {
            TuxTextView tuxTextView = this.LLII;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
            Integer valueOf2 = Integer.valueOf(aweme.getUserDigg());
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                l = Long.valueOf(statistics.getDiggCount());
            } else {
                l = null;
            }
            Context context = getContext();
            if (context == null) {
                return;
            }
            if (valueOf2 != null) {
                i = valueOf2.intValue();
            } else {
                i = 0;
            }
            C2068389v c2068389v = new C2068389v();
            if (i == 1) {
                i2 = R.raw.icon_like_fill;
            } else {
                C97N.LIZ.getClass();
                if (C97N.LIZ()) {
                    i2 = R.raw.icon_like;
                } else {
                    i2 = R.raw.icon_like_bold;
                }
            }
            c2068389v.LIZ = i2;
            if (i == 1) {
                valueOf = Integer.valueOf(R.attr.eb);
            } else {
                valueOf = Integer.valueOf(R.attr.gv);
            }
            c2068389v.LJ = valueOf;
            float f = 14;
            c2068389v.LIZJ = C05040Hs.LIZ(1, f);
            c2068389v.LIZIZ = C05040Hs.LIZ(1, f);
            C8FR LIZIZ = c2068389v.LIZIZ(2, context);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(likeCount)");
            TuxTextView tuxTextView2 = this.LLII;
            if (tuxTextView2 == null) {
                return;
            }
            if (C26338AVi.LIZLLL(tuxTextView2)) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LJJIIJ);
                spannableStringBuilder.append((CharSequence) "x");
                spannableStringBuilder.setSpan(LIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "x");
                spannableStringBuilder.setSpan(LIZIZ, 0, 1, 17);
                spannableStringBuilder.append((CharSequence) LJJIIJ);
            }
            tuxTextView2.setText(spannableStringBuilder);
        }
    }

    @QD3
    public final void onUserDiggUpdated(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 13) {
            Object obj = event.LJLILLLLZI;
            String str = null;
            if (!(obj instanceof String)) {
                obj = null;
            }
            Aweme aweme = this.LLIIIJ;
            if (aweme != null) {
                str = aweme.getAid();
            }
            if (o.LJ(obj, str)) {
                m4(this.LLIIIJ);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        this.LLFII = (TuxTextView) view.findViewById(R.id.desc);
        this.LLIIIILZ = view.findViewById(R.id.c7d);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aa0);
        this.LLFZ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextDirection(5);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.a_v);
        C49421JaT.LJ(smartImageView, true);
        this.LLI = (C72434Sbm) smartImageView;
        this.LLIFFJFJJ = (ImageView) view.findViewById(R.id.aa2);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.fr4);
        this.LLII = tuxTextView2;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(8);
        }
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.mqn);
        this.LLIIII = tuxTextView3;
        if (tuxTextView3 != null) {
            tuxTextView3.setVisibility(8);
        }
        C97N.LIZ.getClass();
        if (C97N.LIZ()) {
            C72434Sbm c72434Sbm = this.LLI;
            if (c72434Sbm != null && (layoutParams = c72434Sbm.getLayoutParams()) != null) {
                layoutParams.width = (int) C78847Ux1.LJJIFFI(20);
                layoutParams.height = (int) C78847Ux1.LJJIFFI(20);
            }
            TuxTextView tuxTextView4 = this.LLFZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(61);
            }
            TuxTextView tuxTextView5 = this.LLII;
            if (tuxTextView5 != null) {
                tuxTextView5.setTuxFont(61);
            }
            TuxTextView tuxTextView6 = this.LLIIII;
            if (tuxTextView6 != null) {
                tuxTextView6.setTuxFont(61);
            }
        }
        C49098JOs.LIZ.getClass();
        Integer num = 0;
        if (num.intValue() > 0) {
            int intValue = num.intValue();
            View view2 = this.LLIIIILZ;
            if (view2 != null) {
                C79043V0l.LJJ((int) C78847Ux1.LJJIFFI(intValue), view2);
            }
            View view3 = this.LLIIIILZ;
            if (view3 != null) {
                C54840Lfg.LJLIIL((int) C78847Ux1.LJJIFFI(intValue), view3);
            }
            TuxTextView tuxTextView7 = this.LLFII;
            if (tuxTextView7 != null) {
                C79043V0l.LJIL((int) C78847Ux1.LJJIFFI(intValue), tuxTextView7);
            }
            TuxTextView tuxTextView8 = this.LLFII;
            if (tuxTextView8 != null) {
                V1B.LJLJLJ(0, tuxTextView8);
            }
        }
        this.LLFFF = new C49448Jau(new C49380JZo(this));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49000JKy interfaceC49000JKy) {
    }
}
