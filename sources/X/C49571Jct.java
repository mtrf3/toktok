package X;

import Y.ARunnableS27S0200000_8;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jct, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49571Jct extends JNU {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final View LJLJL;
    public final C51588KMm LJLJLJ;
    public final TuxTextView LJLJLLL;
    public final TuxIconView LJLL;
    public String LJLLI;

    @Override // X.JNU
    public final View getView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    public final void P(SearchOperation operation) {
        o.LJIIIZ(operation, "operation");
        String docId = operation.getDocId();
        if (docId == null) {
            docId = "";
        }
        this.LJLLI = docId;
        LJLJL().LJJIIZ = new AqS174S0100000_8(this, 191);
        if (!operation.getRecorded()) {
            C49618Jde.LIZ(this.itemView, new ARunnableS27S0200000_8(operation, this, 68));
            operation.setRecorded(true);
        }
        C51588KMm c51588KMm = this.LJLJLJ;
        UrlModel banner = operation.getBanner();
        c51588KMm.getClass();
        if (banner != null && banner.getUrlList() != null && banner.getUrlList().size() != 0) {
            c51588KMm.LJLILLLLZI = banner;
            c51588KMm.getHierarchy().LJIILL(null, 0);
            C81392Vwy<Bitmap> LIZJ = C49612JdY.LIZ.LIZJ(c51588KMm.getUrl());
            c51588KMm.LJLIL = LIZJ;
            if (LIZJ != null && LIZJ.LJIIJ()) {
                Bitmap LJI = c51588KMm.LJLIL.LJI();
                if (!LJI.isRecycled()) {
                    c51588KMm.getHierarchy().LJIILL(new C79265V8z(new BitmapDrawable(LJI), InterfaceC78716Uuu.LJJLIIIJILLIZJL), 0);
                } else {
                    c51588KMm.getHierarchy().LJIILL(null, 0);
                }
            }
        }
        C78765Uvh.LJII(this.LJLJLJ, operation.getBanner(), this.LJLJLJ.getControllerListener());
        this.LJLJLLL.setText(operation.getDesc());
        this.LJLJLLL.setTuxFont(52);
        this.LJLJLLL.setMaxLines(2);
        if (TextUtils.isEmpty(this.LJLJLLL.getText())) {
            this.LJLL.setVisibility(4);
        }
        C16880lQ.LJIIJ(new ViewOnClickListenerC49572Jcu(this, operation), this.itemView);
    }

    public final void Q(String str) {
        String str2;
        JQA LJLJL = LJLJL();
        SearchGlobalViewModel M = M();
        if (M != null) {
            str2 = M.jv0();
        } else {
            str2 = null;
        }
        LJLJL.LIZ(str2);
        if (TextUtils.equals("search_result_click", str)) {
            JNB LIZ = JND.LIZ(LJLJL);
            LIZ.LJIIZILJ("token_type", "activity");
            LIZ.LJJIIJZLJL("1");
            LIZ.LJIJ("search_result_id", this.LJLLI);
            LIZ.LJIIZILJ("aladdin_button_type", "click_photo");
            LIZ.LJIILIIL();
            return;
        }
        if (!TextUtils.equals("search_result_show", str)) {
            return;
        }
        JN8 LIZIZ = JND.LIZIZ(LJLJL);
        LIZIZ.LJIIZILJ("token_type", "activity");
        LIZIZ.LJJIIJZLJL("1");
        LIZIZ.LJIJ("search_result_id", this.LJLLI);
        LIZIZ.LJIILIIL();
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        this.LJLJLJ.setAttached(true);
        this.LJLJLJ.setUserVisibleHint(true);
        Q("search_result_show");
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Animatable LIZ;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        this.LJLJLJ.setAttached(false);
        this.LJLJLJ.setUserVisibleHint(false);
        C51588KMm c51588KMm = this.LJLJLJ;
        if (c51588KMm.getController() == null || (LIZ = c51588KMm.getController().LIZ()) == null || !LIZ.isRunning()) {
            return;
        }
        LIZ.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49571Jct(View itemView, View parent) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(parent, "parent");
        this.LJLJL = parent;
        C51588KMm c51588KMm = (C51588KMm) itemView.findViewById(R.id.hbt);
        this.LJLJLJ = c51588KMm;
        this.LJLJLLL = (TuxTextView) itemView.findViewById(R.id.hbs);
        this.LJLL = (TuxIconView) itemView.findViewById(R.id.gm2);
        this.LJLLI = "";
        c51588KMm.setOutlineProvider(new C73106Smc());
        c51588KMm.setClipToOutline(true);
    }
}
