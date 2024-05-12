package X;

import Y.ARunnableS15S0101000_11;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC226248uK extends LinearLayout implements View.OnClickListener, Observer<C207668Da> {
    public LinkData LJLIL;
    public Aweme LJLILLLLZI;
    public C72433Sbl LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public C227008vY LJLJLJ;
    public C74U LJLJLLL;

    public final boolean LIZIZ() {
        String str;
        LinkData linkData = this.LJLIL;
        String str2 = null;
        if (linkData != null) {
            str = linkData.downloadUrl;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            LinkData linkData2 = this.LJLIL;
            if (linkData2 != null) {
                str2 = linkData2.type;
            }
            if (TextUtils.equals(str2, "app")) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL() {
        IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJIJJ(getContext(), this.LJLIL, this.LJLILLLLZI);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC226248uK(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bbk, C16880lQ.LLZIL(getContext()), this);
        this.LJLJJI = (TuxTextView) LLLZIIL.findViewById(R.id.title);
        this.LJLJI = (C72433Sbl) LLLZIIL.findViewById(R.id.abh);
        this.LJLJJL = (TuxTextView) LLLZIIL.findViewById(R.id.bst);
        this.LJLJJLL = (TuxTextView) LLLZIIL.findViewById(R.id.ftn);
        this.LJLJL = (TuxTextView) LLLZIIL.findViewById(R.id.lje);
        LLLZIIL.findViewById(R.id.ljc);
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, this);
        }
        TuxTextView tuxTextView2 = this.LJLJJLL;
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, this);
        }
        C72433Sbl c72433Sbl = this.LJLJI;
        if (c72433Sbl != null) {
            c72433Sbl.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        }
        TuxTextView tuxTextView3 = this.LJLJJI;
        if (tuxTextView3 != null) {
            C16880lQ.LJJJJI(tuxTextView3, this);
        }
        TuxTextView tuxTextView4 = this.LJLJJL;
        if (tuxTextView4 != null) {
            C16880lQ.LJJJJI(tuxTextView4, this);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
        KL2.LIZJ(context, 51.5f);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        Aweme aweme;
        LinkData linkData;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        int hashCode = str.hashCode();
        Object obj = null;
        if (hashCode != -2103039046) {
            if (hashCode != 1823087802 || !str.equals("comment_dialog_state")) {
                return;
            }
            Object obj2 = c207668Da2.LIZIZ;
            if (obj2 == null) {
                obj2 = Boolean.FALSE;
            }
            if (o.LJ(obj2, 5)) {
                C227008vY c227008vY = this.LJLJLJ;
                if (c227008vY == null) {
                    return;
                }
                c227008vY.LIZIZ();
                return;
            }
            if (o.LJ(obj2, 3)) {
                C227008vY c227008vY2 = this.LJLJLJ;
                if (c227008vY2 == null) {
                    return;
                }
                c227008vY2.LIZIZ();
                return;
            }
            if (o.LJ(obj2, 6)) {
                C227008vY c227008vY3 = this.LJLJLJ;
                if (c227008vY3 == null) {
                    return;
                }
                c227008vY3.LIZIZ();
                return;
            }
            if (o.LJ(obj2, 7)) {
                LIZIZ();
                return;
            } else {
                o.LJ(obj2, 8);
                return;
            }
        }
        if (!str.equals("comment_aweme_and_link")) {
            return;
        }
        Object obj3 = c207668Da2.LIZIZ;
        if (obj3 == null) {
            obj3 = null;
        }
        OSZ osz = (OSZ) obj3;
        if (osz == null || (aweme = (Aweme) osz.getFirst()) == null) {
            return;
        }
        this.LJLILLLLZI = aweme;
        Object obj4 = c207668Da2.LIZIZ;
        if (obj4 != null) {
            obj = obj4;
        }
        OSZ osz2 = (OSZ) obj;
        if (osz2 == null || (linkData = (LinkData) osz2.getSecond()) == null) {
            return;
        }
        this.LJLIL = linkData;
        Aweme aweme2 = this.LJLILLLLZI;
        o.LJI(aweme2);
        LIZ(aweme2, linkData);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Long l;
        String str;
        o.LJIIIZ(v, "v");
        int id = v.getId();
        if (id == R.id.lje) {
            LinkData linkData = this.LJLIL;
            String str2 = null;
            if (linkData != null && (str = linkData.creativeId) != null) {
                l = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                l = null;
            }
            o.LJI(l);
            long longValue = l.longValue();
            if (LIZIZ()) {
                AwemeRawAd awemeRawAd = new AwemeRawAd();
                awemeRawAd.setCreativeId(Long.valueOf(longValue));
                LinkData linkData2 = this.LJLIL;
                if (linkData2 != null) {
                    str2 = linkData2.logExtra;
                }
                awemeRawAd.setLogExtra(str2);
                return;
            }
            LIZLLL();
            C227008vY c227008vY = this.LJLJLJ;
            if (c227008vY != null) {
                c227008vY.LIZIZ();
            }
            LIZJ("click", "button");
            return;
        }
        if (id == R.id.ftn) {
            if (this.LJLJLJ == null) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                o.LJI(LJIIIIZZ);
                this.LJLJLJ = new C227008vY(LJIIIIZZ);
            }
            int LIZJ = (int) KL2.LIZJ(getContext(), 104.0f);
            int LIZJ2 = (int) KL2.LIZJ(getContext(), 138.0f);
            C227008vY c227008vY2 = this.LJLJLJ;
            if (c227008vY2 != null) {
                c227008vY2.LJIILIIL = 0L;
                c227008vY2.LJIILJJIL = 0L;
                c227008vY2.LJIIJ = -1L;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            ViewOnClickListenerC226268uM viewOnClickListenerC226268uM = new ViewOnClickListenerC226268uM(context);
            LinkData linkData3 = this.LJLIL;
            o.LJI(linkData3);
            o.LJI(this.LJLILLLLZI);
            if (linkData3.reportEnabled) {
                TextView textView = viewOnClickListenerC226268uM.LJLJJI;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                TextView textView2 = viewOnClickListenerC226268uM.LJLJJI;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            viewOnClickListenerC226268uM.setInnerClick(new InterfaceC226278uN() { // from class: X.8uL
                @Override // X.InterfaceC226278uN
                public final void LIZ() {
                    C227008vY c227008vY3 = ViewOnClickListenerC226248uK.this.LJLJLJ;
                    if (c227008vY3 != null) {
                        c227008vY3.LIZIZ();
                    }
                    C74U c74u = ViewOnClickListenerC226248uK.this.LJLJLLL;
                    if (c74u != null) {
                        CommentListFragment commentListFragment = (CommentListFragment) ((C226288uO) c74u).LJLIL;
                        if (C63081OpJ.LJJLL(commentListFragment.LJLJI)) {
                            if (!C79004UzY.LJJIFFI(commentListFragment.LLILII.mmItems)) {
                                ListProtector.remove(commentListFragment.LLILII.mmItems, 0);
                                commentListFragment.LLILII.notifyItemRemoved(0);
                            }
                            LinkData LIZ = C63077OpF.LIZ(commentListFragment.LJLJI);
                            if (LIZ != null) {
                                LIZ.setHasDislike(true);
                            }
                            C82544WaS.LIZ(new ARunnableS15S0101000_11(3, commentListFragment, 12));
                        }
                    }
                }

                @Override // X.InterfaceC226278uN
                public final void LIZIZ() {
                    String str3;
                    IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
                    if (iAdCommentDepend != null) {
                        Context context2 = ViewOnClickListenerC226248uK.this.getContext();
                        String LJIIL = iAdCommentDepend.LJIIL();
                        LinkData linkData4 = ViewOnClickListenerC226248uK.this.LJLIL;
                        if (linkData4 != null) {
                            str3 = linkData4.webUrl;
                        } else {
                            str3 = null;
                        }
                        iAdCommentDepend.LJIIJJI(context2, LJIIL, str3);
                    }
                    ViewOnClickListenerC226248uK.this.LIZJ("otherclick", "plan");
                }

                @Override // X.InterfaceC226278uN
                public final void LJLIIL() {
                    String str3;
                    IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
                    if (iAdCommentDepend != null) {
                        Context context2 = ViewOnClickListenerC226248uK.this.getContext();
                        Aweme aweme = ViewOnClickListenerC226248uK.this.LJLILLLLZI;
                        if (aweme != null) {
                            str3 = aweme.getAid();
                        } else {
                            str3 = null;
                        }
                        iAdCommentDepend.LJII(context2, str3);
                    }
                }
            });
            C227008vY c227008vY3 = this.LJLJLJ;
            if (c227008vY3 != null) {
                int LJJJ = C78609UtB.LJJJ(R.attr.cl, getContext());
                c227008vY3.LJIIIIZZ = LJJJ;
                C136845Yq c136845Yq = c227008vY3.LIZIZ;
                if (c136845Yq != null) {
                    c136845Yq.setBgColor(LJJJ);
                }
            }
            C227008vY c227008vY4 = this.LJLJLJ;
            if (c227008vY4 != null) {
                c227008vY4.LIZLLL(viewOnClickListenerC226268uM);
            }
            C227008vY c227008vY5 = this.LJLJLJ;
            if (c227008vY5 != null) {
                c227008vY5.LIZLLL = LIZJ;
                c227008vY5.LJ = LIZJ2;
                c227008vY5.setWidth(LIZJ);
                c227008vY5.setHeight(LIZJ2);
                C136845Yq.LLFFF = LIZJ;
                C136845Yq.LLFII = LIZJ2;
            }
            C227008vY c227008vY6 = this.LJLJLJ;
            if (c227008vY6 != null) {
                int i = c227008vY6.LIZLLL;
                if (i != 0 && c227008vY6.LJ != 0) {
                    c227008vY6.getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(c227008vY6.LJ, 1073741824));
                } else {
                    c227008vY6.getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
                }
            }
            C227008vY c227008vY7 = this.LJLJLJ;
            if (c227008vY7 != null) {
                C227008vY.LJ(c227008vY7, this.LJLJJLL);
            }
            LIZJ("otherclick", "adtag");
            return;
        }
        if (id == R.id.abh) {
            LIZJ("click", "photo");
            LIZLLL();
            C227008vY c227008vY8 = this.LJLJLJ;
            if (c227008vY8 == null) {
                return;
            }
            c227008vY8.LIZIZ();
            return;
        }
        if (id == R.id.bst) {
            LIZJ("click", "title");
            LIZLLL();
            C227008vY c227008vY9 = this.LJLJLJ;
            if (c227008vY9 == null) {
                return;
            }
            c227008vY9.LIZIZ();
            return;
        }
        if (id == R.id.title) {
            LIZJ("click", "source");
            LIZLLL();
            C227008vY c227008vY10 = this.LJLJLJ;
            if (c227008vY10 == null) {
                return;
            }
            c227008vY10.LIZIZ();
            return;
        }
        LIZLLL();
        LIZJ("click", "");
        C227008vY c227008vY11 = this.LJLJLJ;
        if (c227008vY11 == null) {
            return;
        }
        c227008vY11.LIZIZ();
    }

    public final void setDataCenter(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.iv0("comment_aweme_and_link", this, true);
            dataCenter.iv0("comment_dialog_state", this, true);
        }
    }

    public final void setOnDislikeCommentAdListener(C74U dislikeCommentAdListener) {
        o.LJIIIZ(dislikeCommentAdListener, "dislikeCommentAdListener");
        this.LJLJLLL = dislikeCommentAdListener;
    }

    public final void LIZ(Aweme aweme, LinkData linkData) {
        UrlModel urlModel;
        String str;
        String str2;
        V92 hierarchy;
        V8L v8l;
        V92 hierarchy2;
        V8L v8l2;
        this.LJLIL = linkData;
        this.LJLILLLLZI = aweme;
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText(linkData.source);
        }
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(43);
        }
        C72433Sbl c72433Sbl = this.LJLJI;
        String str3 = null;
        if (c72433Sbl != null && (hierarchy2 = c72433Sbl.getHierarchy()) != null && (v8l2 = hierarchy2.LIZJ) != null) {
            v8l2.LIZLLL(C17N.LJIILL(0.5d));
        }
        C72433Sbl c72433Sbl2 = this.LJLJI;
        if (c72433Sbl2 != null && (hierarchy = c72433Sbl2.getHierarchy()) != null && (v8l = hierarchy.LIZJ) != null) {
            v8l.LJFF = C78609UtB.LJJJ(R.attr.dz, getContext());
        }
        C72433Sbl c72433Sbl3 = this.LJLJI;
        LinkData linkData2 = this.LJLIL;
        if (linkData2 != null) {
            urlModel = linkData2.avatarIcon;
        } else {
            urlModel = null;
        }
        C78765Uvh.LJFF(c72433Sbl3, urlModel);
        TuxTextView tuxTextView3 = this.LJLJJL;
        if (tuxTextView3 != null) {
            LinkData linkData3 = this.LJLIL;
            if (linkData3 != null) {
                str = linkData3.title;
            } else {
                str = null;
            }
            tuxTextView3.setText(str);
        }
        TuxTextView tuxTextView4 = this.LJLJJLL;
        if (tuxTextView4 != null) {
            LinkData linkData4 = this.LJLIL;
            if (linkData4 != null) {
                str2 = linkData4.tipsText;
            } else {
                str2 = null;
            }
            tuxTextView4.setText(str2);
        }
        TuxTextView tuxTextView5 = this.LJLJL;
        if (tuxTextView5 != null) {
            LinkData linkData5 = this.LJLIL;
            if (linkData5 != null) {
                str3 = linkData5.buttonText;
            }
            tuxTextView5.setText(str3);
        }
        C7FA.LIZIZ(this.LJLJL);
        LIZIZ();
    }

    public final void LIZJ(String str, String str2) {
        IAdCommentDepend iAdCommentDepend = C182487Ee.LIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJJIIJ(str, getContext(), this.LJLIL, this.LJLILLLLZI, str2);
        }
    }
}
