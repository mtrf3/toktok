package X;

import Y.ACListenerS31S0400000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MfZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57381MfZ extends CardView {
    public static final int LJLLILLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
    public static final int LJLLJ = C7MY.LIZIZ(64);
    public String LJLJLJ;
    public RecUser LJLJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLL;
    public final java.util.Map<Integer, View> LJLLI;

    public final View LJ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJFF() {
        List<Aweme> list;
        RecUser recUser = this.LJLJLLL;
        if (recUser != null) {
            MatchedFriendStruct matchedFriendStruct = recUser.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                list = matchedFriendStruct.getAwemeList();
            } else {
                list = null;
            }
            if (list == null) {
                ((C1AH) LJ(R.id.akv)).setVisibility(8);
                ((C1AH) LJ(R.id.al1)).setVisibility(8);
                ((C1AH) LJ(R.id.al7)).setVisibility(8);
                return;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
            if (LIZIZ != null && LIZIZ.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                RecUser recUser2 = this.LJLJLLL;
                if (recUser2 != null) {
                    RecUserVideoListSharedVM LIZIZ2 = M90.LIZIZ(LIZIZ, recUser2, EnumC57876MnY.FEED_REC_USER_BIG_CARD);
                    RecUser recUser3 = this.LJLJLLL;
                    if (recUser3 != null) {
                        List<Aweme> awemeList = recUser3.getMatchedFriendStruct().getAwemeList();
                        if (awemeList == null) {
                            awemeList = C61878OQg.INSTANCE;
                        }
                        LIZIZ2.iv0(awemeList);
                    } else {
                        o.LJIJI("recUser");
                        throw null;
                    }
                } else {
                    o.LJIJI("recUser");
                    throw null;
                }
            }
            if (list.size() >= 3) {
                ((C1AH) LJ(R.id.akv)).setVisibility(0);
                ((C1AH) LJ(R.id.al1)).setVisibility(0);
                ((C1AH) LJ(R.id.al7)).setVisibility(0);
                SmartImageView big_card_left_cover = (SmartImageView) LJ(R.id.aks);
                o.LJIIIIZZ(big_card_left_cover, "big_card_left_cover");
                TuxTextView big_card_left_cover_count = (TuxTextView) LJ(R.id.aku);
                o.LJIIIIZZ(big_card_left_cover_count, "big_card_left_cover_count");
                LJII(big_card_left_cover, big_card_left_cover_count, (Aweme) ListProtector.get(list, 0));
                SmartImageView big_card_middle_cover = (SmartImageView) LJ(R.id.aky);
                o.LJIIIIZZ(big_card_middle_cover, "big_card_middle_cover");
                TuxTextView big_card_middle_cover_count = (TuxTextView) LJ(R.id.al0);
                o.LJIIIIZZ(big_card_middle_cover_count, "big_card_middle_cover_count");
                LJII(big_card_middle_cover, big_card_middle_cover_count, (Aweme) ListProtector.get(list, 1));
                SmartImageView big_card_right_cover = (SmartImageView) LJ(R.id.al4);
                o.LJIIIIZZ(big_card_right_cover, "big_card_right_cover");
                TuxTextView big_card_right_cover_count = (TuxTextView) LJ(R.id.al6);
                o.LJIIIIZZ(big_card_right_cover_count, "big_card_right_cover_count");
                LJII(big_card_right_cover, big_card_right_cover_count, (Aweme) ListProtector.get(list, 2));
                if (C53576L0y.LIZJ()) {
                    View left_card = LJ(R.id.fop);
                    o.LJIIIIZZ(left_card, "left_card");
                    C26338AVi.LJI(left_card, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))), null, false, 27);
                    View middle_card = LJ(R.id.gja);
                    o.LJIIIIZZ(middle_card, "middle_card");
                    C26338AVi.LJI(middle_card, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, AnonymousClass391.LIZJ(0), null, false, 26);
                    View right_card = LJ(R.id.j28);
                    o.LJIIIIZZ(right_card, "right_card");
                    C26338AVi.LJI(right_card, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))), null, null, null, false, 30);
                    return;
                }
                return;
            }
            if (list.size() == 2) {
                ((C1AH) LJ(R.id.akv)).setVisibility(0);
                ((C1AH) LJ(R.id.al1)).setVisibility(8);
                ((C1AH) LJ(R.id.al7)).setVisibility(0);
                SmartImageView big_card_left_cover2 = (SmartImageView) LJ(R.id.aks);
                o.LJIIIIZZ(big_card_left_cover2, "big_card_left_cover");
                TuxTextView big_card_left_cover_count2 = (TuxTextView) LJ(R.id.aku);
                o.LJIIIIZZ(big_card_left_cover_count2, "big_card_left_cover_count");
                LJII(big_card_left_cover2, big_card_left_cover_count2, (Aweme) ListProtector.get(list, 0));
                SmartImageView big_card_right_cover2 = (SmartImageView) LJ(R.id.al4);
                o.LJIIIIZZ(big_card_right_cover2, "big_card_right_cover");
                TuxTextView big_card_right_cover_count2 = (TuxTextView) LJ(R.id.al6);
                o.LJIIIIZZ(big_card_right_cover_count2, "big_card_right_cover_count");
                LJII(big_card_right_cover2, big_card_right_cover_count2, (Aweme) ListProtector.get(list, 1));
                if (!C53576L0y.LIZJ()) {
                    return;
                }
                View left_card2 = LJ(R.id.fop);
                o.LJIIIIZZ(left_card2, "left_card");
                C26338AVi.LJI(left_card2, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))), null, false, 27);
                View right_card2 = LJ(R.id.j28);
                o.LJIIIIZZ(right_card2, "right_card");
                C26338AVi.LJI(right_card2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, null, false, 30);
                return;
            }
            ((C1AH) LJ(R.id.akv)).setVisibility(8);
            ((C1AH) LJ(R.id.al1)).setVisibility(8);
            ((C1AH) LJ(R.id.al7)).setVisibility(8);
            return;
        }
        o.LJIJI("recUser");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C221018lt.LIZ("TTRecUserBigCardCoverView", "[onViewAttachedToWindow]");
        ((SmartImageView) LJ(R.id.aks)).setAttached(true);
        ((SmartImageView) LJ(R.id.aky)).setAttached(true);
        ((SmartImageView) LJ(R.id.al4)).setAttached(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C221018lt.LIZ("TTRecUserBigCardCoverView", "[onViewDetachedFromWindow]");
        ((SmartImageView) LJ(R.id.aks)).setAttached(false);
        ((SmartImageView) LJ(R.id.aky)).setAttached(false);
        ((SmartImageView) LJ(R.id.al4)).setAttached(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57381MfZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.ca1, C16880lQ.LLZIL(context), this);
        this.LJLJLJ = "";
    }

    public final void LJI(int i, int i2, C57381MfZ c57381MfZ) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        View LJ = LJ(R.id.fop);
        ViewGroup.LayoutParams layoutParams = LJ(R.id.fop).getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        LJ.setLayoutParams(layoutParams);
        View LJ2 = LJ(R.id.gja);
        ViewGroup.LayoutParams layoutParams2 = LJ(R.id.gja).getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i2;
        LJ2.setLayoutParams(layoutParams2);
        View LJ3 = LJ(R.id.j28);
        ViewGroup.LayoutParams layoutParams3 = LJ(R.id.j28).getLayoutParams();
        layoutParams3.width = i;
        layoutParams3.height = i2;
        LJ3.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = c57381MfZ.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            if (C57626MjW.LJ()) {
                if (C53576L0y.LIZJ()) {
                    int LIZIZ = C7MY.LIZIZ(320);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    int LIZ = C47135Ieh.LIZ(80, C53946LFe.LIZJ(C45804HyK.LJIJJ(context), null).LIZIZ);
                    if (LIZIZ > LIZ) {
                        LIZIZ = LIZ;
                    }
                    i3 = (int) (((LIZIZ * 4) / 3) * 0.14d);
                } else {
                    i3 = LJLLJ;
                }
            } else {
                i3 = LJLLILLLL;
            }
            marginLayoutParams.topMargin = i3;
        }
        c57381MfZ.setCardBackgroundColor(0);
        c57381MfZ.setCardElevation(0.0f);
        c57381MfZ.setLayoutParams(layoutParams4);
        if (C53576L0y.LIZJ()) {
            c57381MfZ.setRadius(C32151Nz.LJIIZILJ(4));
        }
        if (C99W.LIZ) {
            c57381MfZ.setRadius(C32151Nz.LJIIZILJ(8));
        }
    }

    public final void LJII(SmartImageView smartImageView, TuxTextView tuxTextView, Aweme aweme) {
        long j;
        UrlModel cover;
        List<String> urlList;
        C72242sW c72242sW = new C72242sW();
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        c72242sW.element = j;
        tuxTextView.setText(C77123UOp.LJJIIJ(j));
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS31S0400000_9(this, aweme, c72242sW, tuxTextView, 0));
        Video video = aweme.getVideo();
        Bitmap.Config config = null;
        if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || urlList.isEmpty()) {
            smartImageView.setActualImageResource(R.color.ao);
            return;
        }
        List<String> urlList2 = aweme.getVideo().getCover().getUrlList();
        if (C248339or.LIZ()) {
            config = Bitmap.Config.ARGB_8888;
        }
        Video video2 = aweme.getVideo();
        o.LJIIIIZZ(video2, "aweme.video");
        boolean LIZLLL = C208458Gb.LIZLLL(smartImageView, video2, "TTRecUserBigCardCoverView", false, null, null, false, config, false, 888);
        if (aweme.getVideo().isCallback() && LIZLLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("refreshCover: use dynamic img, url list: ");
            LIZ.append(urlList2);
            C221018lt.LIZ("TTRecUserBigCardCoverView", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("refreshCover: use static img, url list: ");
        LIZ2.append(urlList2);
        C221018lt.LIZ("TTRecUserBigCardCoverView", X1D.LIZIZ(LIZ2));
        W5F LJII = W5U.LJII(C78939UyV.LJ(aweme.getVideo().getCover()));
        int[] LIZ3 = J7H.LIZ(200);
        if (LIZ3 != null) {
            LJII.LJIILIIL(LIZ3);
        }
        C57743MlP c57743MlP = InterfaceC57744MlQ.LJJII;
        LJII.LJJIIJ = smartImageView;
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        C57743MlP.LIZJ(c57743MlP, LJII, this.LJLJLJ, EnumC57383Mfb.COVER);
    }
}
