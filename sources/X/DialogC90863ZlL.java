package X;

import Y.IDCListenerS136S0100000_24;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.ZlL, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class DialogC90863ZlL extends C18Z {
    public static final /* synthetic */ int LLIL = 0;
    public final ZY5 LJLJI;
    public final C90588Zgu LJLJJI;
    public C90101ZXt LJLJJL;
    public ZY4 LJLJJLL;
    public final List<ZY4> LJLJL;
    public final List<ZY4> LJLJLJ;
    public final List<ZY4> LJLJLLL;
    public final List<ZY4> LJLL;
    public final Context LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public long LJLLL;
    public final Handler LJLLLL;
    public RecyclerView LJLLLLLL;
    public C90591Zgx LJLZ;
    public ZXR LJZ;
    public java.util.Map<String, AbstractC90587Zgt> LJZI;
    public ZY4 LJZL;
    public java.util.Map<String, Integer> LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public ImageButton LLFFF;
    public Button LLFII;
    public ImageView LLFZ;
    public View LLI;
    public ImageView LLIFFJFJJ;
    public TextView LLII;
    public TextView LLIIII;
    public String LLIIIILZ;
    public MediaControllerCompat LLIIIJ;
    public final C90586Zgs LLIIIL;
    public MediaDescriptionCompat LLIIIZ;
    public AsyncTaskC90585Zgr LLIIJI;
    public Bitmap LLIIJLIL;
    public android.net.Uri LLIIL;
    public boolean LLIILII;
    public Bitmap LLIILZL;
    public int LLIIZ;

    public final void LJIJJLI() {
        Bitmap bitmap;
        Bitmap bitmap2;
        android.net.Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.LLIIIZ;
        android.net.Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.mIcon;
            uri2 = mediaDescriptionCompat.mIconUri;
        }
        AsyncTaskC90585Zgr asyncTaskC90585Zgr = this.LLIIJI;
        if (asyncTaskC90585Zgr == null) {
            bitmap2 = this.LLIIJLIL;
            uri = this.LLIIL;
        } else {
            bitmap2 = asyncTaskC90585Zgr.LIZ;
            uri = asyncTaskC90585Zgr.LIZIZ;
        }
        if (bitmap2 == bitmap && (bitmap2 != null || Objects.equals(uri, uri2))) {
            return;
        }
        AsyncTaskC90585Zgr asyncTaskC90585Zgr2 = this.LLIIJI;
        if (asyncTaskC90585Zgr2 != null) {
            asyncTaskC90585Zgr2.cancel(true);
        }
        AsyncTaskC90585Zgr asyncTaskC90585Zgr3 = new AsyncTaskC90585Zgr(this);
        this.LLIIJI = asyncTaskC90585Zgr3;
        asyncTaskC90585Zgr3.execute1(new Void[0]);
    }

    public final void LJJI() {
        int LIZ;
        Context context = this.LJLLI;
        int i = -1;
        if (!context.getResources().getBoolean(R.bool.a)) {
            LIZ = -1;
        } else {
            LIZ = ZXL.LIZ(context);
        }
        if (this.LJLLI.getResources().getBoolean(R.bool.a)) {
            i = -2;
        }
        getWindow().setLayout(LIZ, i);
        this.LLIIJLIL = null;
        this.LLIIL = null;
        LJIJJLI();
        LJJIFFI();
        LJJIII();
    }

    public final void LJJIFFI() {
        CharSequence charSequence;
        Bitmap bitmap;
        if (this.LJZL != null || this.LLD || (!this.LJLLILLLL)) {
            this.LLFF = true;
            return;
        }
        this.LLFF = false;
        if (!this.LJLJJLL.LJI() || this.LJLJJLL.LIZLLL()) {
            dismiss();
        }
        CharSequence charSequence2 = null;
        if (!this.LLIILII || (((bitmap = this.LLIILZL) != null && bitmap.isRecycled()) || this.LLIILZL == null)) {
            Bitmap bitmap2 = this.LLIILZL;
            if (bitmap2 != null) {
                bitmap2.isRecycled();
            }
            this.LLIFFJFJJ.setVisibility(8);
            this.LLI.setVisibility(8);
            this.LLFZ.setImageBitmap(null);
        } else {
            this.LLIFFJFJJ.setVisibility(0);
            this.LLIFFJFJJ.setImageBitmap(this.LLIILZL);
            this.LLIFFJFJJ.setBackgroundColor(this.LLIIZ);
            this.LLI.setVisibility(0);
            Bitmap bitmap3 = this.LLIILZL;
            RenderScript create = RenderScript.create(this.LJLLI);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.LLFZ.setImageBitmap(copy);
        }
        this.LLIILII = false;
        this.LLIILZL = null;
        this.LLIIZ = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.LLIIIZ;
        if (mediaDescriptionCompat == null) {
            charSequence = null;
        } else {
            charSequence = mediaDescriptionCompat.mTitle;
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.LLIIIZ;
        if (mediaDescriptionCompat2 != null) {
            charSequence2 = mediaDescriptionCompat2.mSubtitle;
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence2);
        if (z) {
            this.LLII.setText(charSequence);
        } else {
            this.LLII.setText(this.LLIIIILZ);
        }
        if (isEmpty) {
            this.LLIIII.setText(charSequence2);
            this.LLIIII.setVisibility(0);
        } else {
            this.LLIIII.setVisibility(8);
        }
    }

    public final void LJJII() {
        ((ArrayList) this.LJLJL).clear();
        ((ArrayList) this.LJLJLJ).clear();
        ((ArrayList) this.LJLJLLL).clear();
        ((ArrayList) this.LJLJL).addAll(this.LJLJJLL.LIZIZ());
        ZY2 zy2 = this.LJLJJLL.LIZ;
        zy2.getClass();
        ZY5.LIZIZ();
        for (ZY4 zy4 : Collections.unmodifiableList(zy2.LIZIZ)) {
            ZY3 LIZ = this.LJLJJLL.LIZ(zy4);
            if (LIZ != null) {
                C90092ZXk c90092ZXk = LIZ.LIZ;
                if (c90092ZXk != null && c90092ZXk.LIZLLL) {
                    ((ArrayList) this.LJLJLJ).add(zy4);
                }
                C90092ZXk c90092ZXk2 = LIZ.LIZ;
                if (c90092ZXk2 != null && c90092ZXk2.LJ) {
                    ((ArrayList) this.LJLJLLL).add(zy4);
                }
            }
        }
        LJIJJ(this.LJLJLJ);
        LJIJJ(this.LJLJLLL);
        List<ZY4> list = this.LJLJL;
        ZXQ zxq = ZXQ.LJLIL;
        Collections.sort(list, zxq);
        Collections.sort(this.LJLJLJ, zxq);
        Collections.sort(this.LJLJLLL, zxq);
        this.LJLZ.LJZI();
    }

    public final void LJJIII() {
        if (this.LJLLJ) {
            if (SystemClock.uptimeMillis() - this.LJLLL >= 300) {
                if (this.LJZL != null || this.LLD || (!this.LJLLILLLL)) {
                    this.LLF = true;
                    return;
                }
                this.LLF = false;
                if (!this.LJLJJLL.LJI() || this.LJLJJLL.LIZLLL()) {
                    dismiss();
                }
                this.LJLLL = SystemClock.uptimeMillis();
                this.LJLZ.LJZ();
                return;
            }
            this.LJLLLL.removeMessages(1);
            this.LJLLLL.sendEmptyMessageAtTime(1, this.LJLLL + 300);
        }
    }

    public final void LJJIIJ() {
        if (this.LLF) {
            LJJIII();
        }
        if (this.LLFF) {
            LJJIFFI();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLJ = true;
        this.LJLJI.LIZ(this.LJLJJL, this.LJLJJI, 1);
        LJJII();
        this.LJLJI.getClass();
        LJIL(ZY5.LIZLLL());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLJ = false;
        this.LJLJI.LJI(this.LJLJJI);
        this.LJLLLL.removeCallbacksAndMessages(null);
        LJIL(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC90863ZlL(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = X.ZXT.LIZ(r3, r0)
            int r0 = X.ZXT.LIZIZ(r1)
            r2.<init>(r1, r0)
            X.ZXt r0 = X.C90101ZXt.LIZJ
            r2.LJLJJL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.LJLJL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.LJLJLJ = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.LJLJLLL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.LJLL = r0
            Y.IDHandlerS26S0100000_24 r1 = new Y.IDHandlerS26S0100000_24
            r0 = 2
            r1.<init>(r2, r0)
            r2.LJLLLL = r1
            android.content.Context r0 = r2.getContext()
            r2.LJLLI = r0
            X.ZY5 r0 = X.ZY5.LIZJ(r0)
            r2.LJLJI = r0
            X.Zgu r0 = new X.Zgu
            r0.<init>(r2)
            r2.LJLJJI = r0
            X.ZY4 r0 = X.ZY5.LJ()
            r2.LJLJJLL = r0
            X.Zgs r0 = new X.Zgs
            r0.<init>(r2)
            r2.LLIIIL = r0
            android.support.v4.media.session.MediaSessionCompat$Token r0 = X.ZY5.LIZLLL()
            r2.LJIL(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC90863ZlL.<init>(android.content.Context):void");
    }

    public final void LJIJJ(List<ZY4> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ZY4 zy4 = (ZY4) ListProtector.get(list, size);
            if (zy4.LIZLLL() || !zy4.LJI || !zy4.LJII(this.LJLJJL) || this.LJLJJLL == zy4) {
                ListProtector.remove(list, size);
            }
        }
    }

    public final void LJIL(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.LLIIIJ;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.LIZJ(this.LLIIIL);
            this.LLIIIJ = null;
        }
        if (token == null || !this.LJLLJ) {
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.LJLLI, token);
        this.LLIIIJ = mediaControllerCompat2;
        mediaControllerCompat2.LIZIZ(this.LLIIIL);
        MediaMetadataCompat LIZ = this.LLIIIJ.LIZ();
        if (LIZ != null) {
            mediaDescriptionCompat = LIZ.LIZIZ();
        }
        this.LLIIIZ = mediaDescriptionCompat;
        LJIJJLI();
        LJJIFFI();
    }

    public final void LJJ(C90101ZXt c90101ZXt) {
        if (c90101ZXt != null) {
            if (!this.LJLJJL.equals(c90101ZXt)) {
                this.LJLJJL = c90101ZXt;
                if (this.LJLLJ) {
                    this.LJLJI.LJI(this.LJLJJI);
                    this.LJLJI.LIZ(c90101ZXt, this.LJLJJI, 1);
                    LJJII();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.g);
        ZXT.LJIIIZ(this.LJLLI, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.ac);
        this.LLFFF = imageButton;
        imageButton.setColorFilter(-1);
        C16880lQ.LJIILL(this.LLFFF, new IDCListenerS136S0100000_24(this, 4));
        Button button = (Button) findViewById(R.id.as);
        this.LLFII = button;
        button.setTextColor(-1);
        C16880lQ.LJIILIIL(this.LLFII, new IDCListenerS136S0100000_24(this, 5));
        this.LJLZ = new C90591Zgx(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ai);
        this.LJLLLLLL = recyclerView;
        recyclerView.setAdapter(this.LJLZ);
        this.LJLLLLLL.setLayoutManager(new LinearLayoutManager());
        this.LJZ = new ZXR(this);
        this.LJZI = new HashMap();
        this.LL = new HashMap();
        this.LLFZ = (ImageView) findViewById(R.id.ak);
        this.LLI = findViewById(R.id.al);
        this.LLIFFJFJJ = (ImageView) findViewById(R.id.aj);
        TextView textView = (TextView) findViewById(R.id.an);
        this.LLII = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.am);
        this.LLIIII = textView2;
        textView2.setTextColor(-1);
        this.LLIIIILZ = this.LJLLI.getResources().getString(R.string.an);
        this.LJLLILLLL = true;
        LJJI();
    }
}
