package X;

import Y.ACListenerS38S0200000_3;
import Y.IDCListenerS296S0100000_3;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.74V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C74V {
    public static final int LJIIIZ;
    public static final int LJIIJ;
    public static final float LJIIJJI;
    public static final float LJIIL;
    public static final int LJIILIIL;
    public ViewStub LIZ;
    public View LIZIZ;
    public SmartImageView LIZJ;
    public C5GC LIZLLL;
    public TuxIconView LJ;
    public View LJFF;
    public WeakReference<AbsFragment> LJI;
    public String LJII;
    public View LJIIIIZZ;

    static {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(112));
        LJIIIZ = LJJIIZ;
        int LIZIZ = C7MY.LIZIZ(150);
        LJIIJ = LIZIZ;
        float f = LJJIIZ;
        float f2 = LIZIZ;
        LJIIJJI = f / f2;
        LJIIL = f2 / f;
        LJIILIIL = C7MY.LIZIZ(8);
    }

    public final void LIZ(final Comment comment) {
        List<CommentImageStruct> imageList;
        CommentImageStruct commentImageStruct;
        String str;
        int i;
        int i2;
        List<CommentImageStruct> imageList2;
        View view;
        SmartImageView smartImageView;
        C5GC c5gc;
        View view2;
        TuxIconView tuxIconView;
        if (comment == null || (imageList = comment.getImageList()) == null || imageList.isEmpty()) {
            View view3 = this.LIZIZ;
            if (view3 == null) {
                return;
            }
            view3.setVisibility(8);
            return;
        }
        if (this.LIZIZ == null) {
            ViewStub viewStub = this.LIZ;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.LIZIZ = view;
            if (view != null) {
                smartImageView = (SmartImageView) view.findViewById(R.id.bkj);
            } else {
                smartImageView = null;
            }
            this.LIZJ = smartImageView;
            View view4 = this.LIZIZ;
            if (view4 != null) {
                c5gc = (C5GC) view4.findViewById(R.id.bmf);
            } else {
                c5gc = null;
            }
            this.LIZLLL = c5gc;
            View view5 = this.LIZIZ;
            if (view5 != null) {
                view2 = view5.findViewById(R.id.bkl);
            } else {
                view2 = null;
            }
            this.LJFF = view2;
            View view6 = this.LIZIZ;
            if (view6 != null) {
                tuxIconView = (TuxIconView) view6.findViewById(R.id.bme);
            } else {
                tuxIconView = null;
            }
            this.LJ = tuxIconView;
            SmartImageView smartImageView2 = this.LIZJ;
            if (smartImageView2 != null) {
                smartImageView2.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 8));
            }
        }
        View view7 = this.LIZIZ;
        if (view7 != null) {
            view7.setVisibility(0);
        }
        if (comment != null && (imageList2 = comment.getImageList()) != null) {
            commentImageStruct = (CommentImageStruct) ORZ.LJLLLLLL(0, imageList2);
        } else {
            commentImageStruct = null;
        }
        if (comment != null) {
            str = comment.getCid();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        final UrlModel urlModel = (UrlModel) ((java.util.Map) C174936tl.LIZ.getValue()).get(str);
        if (urlModel != null || (commentImageStruct != null && ((urlModel = commentImageStruct.getCropUrl()) != null || (commentImageStruct != null && (urlModel = commentImageStruct.getOriginUrl()) != null)))) {
            View view8 = this.LIZIZ;
            int width = urlModel.getWidth();
            int height = urlModel.getHeight();
            if (view8 != null && width != 0 && height != 0) {
                float f = width / height;
                float f2 = LJIIJJI;
                if (f < f2) {
                    i = LJIIIZ;
                    i2 = LJIIJ;
                } else if (f <= LJIIL && f2 <= f) {
                    if (width < height) {
                        i = LJIIIZ;
                        i2 = (int) (i / f);
                    } else {
                        i2 = LJIIIZ;
                        i = (int) (i2 * f);
                    }
                } else {
                    i = LJIIJ;
                    i2 = LJIIIZ;
                }
                ViewGroup.LayoutParams layoutParams = view8.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                    layoutParams.height = i2 + LJIILIIL;
                }
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            SmartImageView smartImageView3 = this.LIZJ;
            if (smartImageView3 != null) {
                smartImageView3.setBackground(null);
            }
            SmartImageView smartImageView4 = this.LIZJ;
            if (smartImageView4 != null) {
                smartImageView4.setImageDrawable(null);
            }
            SmartImageView smartImageView5 = this.LIZJ;
            if (smartImageView5 != null) {
                C16880lQ.LJJIJLIJ(smartImageView5, null);
            }
            LJII.LIZIZ("CommentImageComponent");
            LJII.LJJIIJ = this.LIZJ;
            LJII.LJJIZ = new SIR() { // from class: X.74W
                @Override // X.SIR
                public final /* synthetic */ void LIZ(JSONObject jSONObject) {
                }

                @Override // X.SIR
                public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str2, boolean z) {
                    String cid;
                    String cid2;
                    if (z) {
                        Comment comment2 = Comment.this;
                        if (comment2 != null && (cid2 = comment2.getCid()) != null) {
                            Y89.LIZJ(1, cid2);
                            return;
                        }
                        return;
                    }
                    Comment comment3 = Comment.this;
                    if (comment3 == null || (cid = comment3.getCid()) == null) {
                        return;
                    }
                    Y89.LIZJ(0, cid);
                }
            };
            LJII.LJFF(new AbstractC72439Sbr() { // from class: X.74X
                @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
                public final void T1(android.net.Uri uri, SmartImageView smartImageView6) {
                    String cid;
                    super.T1(uri, smartImageView6);
                    Comment comment2 = Comment.this;
                    if (comment2 != null && (cid = comment2.getCid()) != null) {
                        Y89.LJIIIIZZ(urlModel, cid, "preview");
                    }
                }

                @Override // X.InterfaceC70769Rq1
                public final void s2(android.net.Uri uri, View view9, Throwable th) {
                    ViewGroup.LayoutParams layoutParams2;
                    Context context;
                    SmartImageView smartImageView6;
                    SmartImageView smartImageView7 = this.LIZJ;
                    if (smartImageView7 != null && (context = smartImageView7.getContext()) != null && (smartImageView6 = this.LIZJ) != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_image_alt_1_fill;
                        c2068389v.LJ = Integer.valueOf(R.attr.cj);
                        c2068389v.LIZIZ = C7MY.LIZIZ(24);
                        c2068389v.LIZJ = C7MY.LIZIZ(24);
                        SY9 LIZ = c2068389v.LIZ(context);
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
                        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
                        smartImageView6.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context)));
                    }
                    C74V c74v = this;
                    SmartImageView smartImageView8 = c74v.LIZJ;
                    if (smartImageView8 != null) {
                        C16880lQ.LJJIJLIJ(smartImageView8, new ACListenerS38S0200000_3(c74v, Comment.this, 91));
                    }
                    View view10 = this.LIZIZ;
                    if (view10 != null && (layoutParams2 = view10.getLayoutParams()) != null) {
                        layoutParams2.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
                        layoutParams2.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75)) + C74V.LJIILIIL;
                    }
                    View view11 = this.LIZIZ;
                    if (view11 != null) {
                        view11.requestLayout();
                    }
                }

                @Override // X.InterfaceC70769Rq1
                public final void U0(android.net.Uri uri, View view9, C2047581v c2047581v, Animatable animatable) {
                    C74V c74v = this;
                    SmartImageView smartImageView6 = c74v.LIZJ;
                    if (smartImageView6 != null) {
                        C16880lQ.LJJIJLIJ(smartImageView6, new ACListenerS38S0200000_3(c74v, Comment.this, 90));
                    }
                }
            });
        } else {
            SmartImageView smartImageView6 = this.LIZJ;
            if (smartImageView6 != null) {
                smartImageView6.setImageURI("");
            }
        }
        LIZLLL(commentImageStruct);
    }

    public final void LIZJ(Comment comment) {
        CommentImageStruct commentImageStruct = null;
        if (comment != null && comment.getImageList() != null) {
            List<CommentImageStruct> imageList = comment.getImageList();
            if (imageList != null) {
                commentImageStruct = (CommentImageStruct) ORZ.LJLLLLLL(0, imageList);
            }
            LIZLLL(commentImageStruct);
        }
    }

    public final void LIZLLL(CommentImageStruct commentImageStruct) {
        int i;
        Context context;
        Integer LJI;
        Context context2;
        Integer LJI2;
        if (commentImageStruct != null) {
            i = commentImageStruct.getProgress();
        } else {
            i = 0;
        }
        if (i != -1) {
            if (i != 100) {
                C27740Aue.LJIIJ(true, this.LJFF, this.LIZLLL);
                TuxIconView tuxIconView = this.LJ;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(8);
                }
                View view = this.LJFF;
                if (view != null && (context2 = view.getContext()) != null && (LJI2 = C79045V0n.LJI(R.attr.d9, context2)) != null) {
                    int intValue = LJI2.intValue();
                    View view2 = this.LJFF;
                    if (view2 != null) {
                        view2.setBackgroundColor(intValue);
                    }
                }
                C5GC c5gc = this.LIZLLL;
                if (c5gc != null) {
                    c5gc.setProgress(i);
                    return;
                }
                return;
            }
            C27740Aue.LJIIJ(false, this.LJFF, this.LIZLLL, this.LJ);
            return;
        }
        C27740Aue.LJIIJ(true, this.LJFF, this.LJ);
        C5GC c5gc2 = this.LIZLLL;
        if (c5gc2 != null) {
            c5gc2.setVisibility(8);
        }
        View view3 = this.LJFF;
        if (view3 == null || (context = view3.getContext()) == null || (LJI = C79045V0n.LJI(R.attr.ee, context)) == null) {
            return;
        }
        int intValue2 = LJI.intValue();
        View view4 = this.LJFF;
        if (view4 == null) {
            return;
        }
        view4.setBackgroundColor(intValue2);
    }

    public final void LIZIZ(View itemView, AbsFragment fragment, InterfaceC1797373p listener) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(listener, "listener");
        this.LIZ = (ViewStub) itemView.findViewById(R.id.bkk);
        this.LJI = new WeakReference<>(fragment);
        this.LJIIIIZZ = itemView;
    }
}
