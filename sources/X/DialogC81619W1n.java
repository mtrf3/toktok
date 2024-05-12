package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.W1n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC81619W1n extends Dialog {
    public static final /* synthetic */ int LJLLI = 0;
    public final Effect LJLIL;
    public final C46421IJt LJLILLLLZI;
    public C42883GsJ LJLJI;
    public W5G LJLJJI;
    public C47689Ind LJLJJL;
    public VideoViewComponent LJLJJLL;
    public TextView LJLJL;
    public Video LJLJLJ;
    public C81621W1p LJLJLLL;
    public Handler LJLL;

    @Override // android.app.Dialog
    public final void show() {
        if (this.LJLIL != null) {
            Application application = C60903NvH.LJ;
            C78934UyQ.LJLIL.getSpService().getClass();
            VJH LIZ = VJG.LIZ(application, "guide");
            String string = LIZ.LIZ.getString("upload_pic_sticker_show", "");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(string);
            LIZ2.append(this.LJLIL.getEffectId());
            LIZ2.append(',');
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if (LIZ.LIZIZ == null) {
                LIZ.LIZIZ = LIZ.LIZ.edit();
            }
            LIZ.LIZIZ.putString("upload_pic_sticker_show", LIZIZ).apply();
        }
        if (new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-1691563418853687439")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        VideoViewComponent videoViewComponent = this.LJLJJLL;
        if (videoViewComponent != null) {
            C81621W1p c81621W1p = this.LJLJLLL;
            if (c81621W1p != null) {
                videoViewComponent.LLIIIILZ(c81621W1p);
            }
            VideoViewComponent videoViewComponent2 = this.LJLJJLL;
            o.LJI(videoViewComponent2);
            videoViewComponent2.LJIIIZ();
        }
        super.dismiss();
    }

    public final void LIZ(boolean z) {
        int i;
        C42883GsJ c42883GsJ = this.LJLJI;
        if (c42883GsJ != null) {
            o.LJI(c42883GsJ);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c42883GsJ.setVisibility(i);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        C46421IJt c46421IJt;
        super.onCreate(bundle);
        setContentView(R.layout.bn6);
        Window window = getWindow();
        o.LJI(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        o.LJI(window2);
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        shapeDrawable.getPaint().setColor(0);
        Window window3 = getWindow();
        o.LJI(window3);
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(true);
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 107), findViewById(R.id.j83));
        C46421IJt c46421IJt2 = this.LJLILLLLZI;
        if (c46421IJt2 == null || TextUtils.isEmpty(c46421IJt2.LIZ()) || !(!TextUtils.isEmpty(c46421IJt2.LIZIZ()))) {
            return;
        }
        this.LJLJJL = (C47689Ind) findViewById(R.id.n9f);
        this.LJLJJI = (W5G) findViewById(R.id.f59);
        this.LJLJI = (C42883GsJ) findViewById(R.id.g94);
        this.LJLJL = (TextView) findViewById(R.id.buj);
        View findViewById = findViewById(R.id.n6e);
        W5G w5g = this.LJLJJI;
        o.LJI(w5g);
        findViewById.setOutlineProvider(new C74263TCp((int) KL2.LIZJ(w5g.getContext(), 4.0f)));
        findViewById.setClipToOutline(true);
        findViewById(R.id.gcc).setBackground(C78127UlP.LIZJ(-1, -1, 0, (int) KL2.LIZJ(getContext(), 4.0f)));
        Drawable LIZJ = C78127UlP.LIZJ(303437859, 303437859, 0, 0);
        V92 LIZ = new C79077V1t(getContext().getResources()).LIZ();
        LIZ.LJIILL(LIZJ, 1);
        LIZ.LJIILL(LIZJ, 5);
        W5G w5g2 = this.LJLJJI;
        o.LJI(w5g2);
        w5g2.setHierarchy(LIZ);
        C46421IJt c46421IJt3 = this.LJLILLLLZI;
        if (c46421IJt3 != null) {
            if (!TextUtils.isEmpty(c46421IJt3.LIZ())) {
                C78764Uvg.LJIIIZ(this.LJLJJI, this.LJLILLLLZI.LIZ(), -1, -1);
            }
            if (TextUtils.isEmpty(this.LJLILLLLZI.LIZJ)) {
                TextView textView = this.LJLJL;
                o.LJI(textView);
                textView.setVisibility(8);
            } else {
                TextView textView2 = this.LJLJL;
                o.LJI(textView2);
                textView2.setVisibility(0);
                TextView textView3 = this.LJLJL;
                o.LJI(textView3);
                textView3.setText(this.LJLILLLLZI.LIZJ);
            }
        }
        this.LJLJLLL = new C81621W1p(this);
        C47689Ind c47689Ind = this.LJLJJL;
        o.LJI(c47689Ind);
        C47246IgU LIZJ2 = C47246IgU.LIZJ(c47689Ind);
        VideoViewComponent videoViewComponent = new VideoViewComponent();
        this.LJLJJLL = videoViewComponent;
        C47689Ind c47689Ind2 = this.LJLJJL;
        o.LJI(c47689Ind2);
        videoViewComponent.LJIILJJIL(c47689Ind2);
        VideoViewComponent videoViewComponent2 = this.LJLJJLL;
        o.LJI(videoViewComponent2);
        videoViewComponent2.LIZ(this.LJLJLLL);
        LIZJ2.N7(new C81620W1o(this));
        if (this.LJLJJLL == null || (c46421IJt = this.LJLILLLLZI) == null || TextUtils.isEmpty(c46421IJt.LIZIZ())) {
            return;
        }
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setBytevc1(false);
            ArrayList arrayList = new ArrayList();
            C46421IJt c46421IJt4 = this.LJLILLLLZI;
            o.LJI(c46421IJt4);
            String LIZIZ = c46421IJt4.LIZIZ();
            o.LJI(LIZIZ);
            arrayList.add(LIZIZ);
            videoUrlModel.setUrlList(arrayList);
            videoUrlModel.setUrlKey(this.LJLILLLLZI.LIZIZ);
            videoUrlModel.setUri(this.LJLILLLLZI.LIZIZ);
            Video video = this.LJLJLJ;
            o.LJI(video);
            video.setPlayAddr(videoUrlModel);
            Video video2 = this.LJLJLJ;
            o.LJI(video2);
            video2.setSourceId(this.LJLILLLLZI.LIZIZ);
        }
        LIZ(true);
        VideoViewComponent videoViewComponent3 = this.LJLJJLL;
        o.LJI(videoViewComponent3);
        Video video3 = this.LJLJLJ;
        o.LJI(video3);
        videoViewComponent3.LJIIL(video3);
        Handler handler = this.LJLL;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new ARunnableS50S0100000_14(this, 224), 5000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC81619W1n(C29S context, Effect effect, C46421IJt c46421IJt) {
        super(context, R.style.jg);
        o.LJIIIZ(context, "context");
        this.LJLIL = effect;
        this.LJLILLLLZI = c46421IJt;
    }
}
