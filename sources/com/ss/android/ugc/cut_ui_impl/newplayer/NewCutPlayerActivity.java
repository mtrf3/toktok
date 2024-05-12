package com.ss.android.ugc.cut_ui_impl.newplayer;

import X.AbstractActivityC171766oe;
import X.AbstractBinderC172036p5;
import X.AbstractC029409q;
import X.C171956ox;
import X.C172066p8;
import X.C172076p9;
import X.C172086pA;
import X.C172096pB;
import X.C172126pE;
import X.C172136pF;
import X.C172196pL;
import X.C172206pM;
import X.C47261Igj;
import X.C65803Ps7;
import X.EXS;
import X.ProgressDialogC173666ri;
import X.ServiceConnectionC82880Wfs;
import X.XKX;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS11S0100100_2;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS8S0110000_2;
import Y.ARunnableS9S0101000_5;
import Y.IDCListenerS77S0000000_2;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.cut_ui.CutResultData;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NewCutPlayerActivity extends AbstractActivityC171766oe {
    public static final /* synthetic */ int LLIIIJ = 0;
    public C172206pM LLIFFJFJJ;
    public boolean LLII;
    public final C172136pF LLIIII = new C172136pF();
    public ProgressDialogC173666ri LLIIIILZ;

    @Override // X.AbstractActivityC171766oe, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLILIL() {
        runOnUiThread(new ARunnableS9S0101000_5(6, this, 8));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LLIIII.getClass();
        this.LLIIII.getClass();
        if (!o.LJ(this.LLFF, this.LLD)) {
            if (isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getApplication().getString(R.string.e7w));
            builder.setMessage(getApplication().getString(R.string.e7v));
            builder.setPositiveButton("OK", new IDCListenerS77S0000000_2(0));
            builder.setNegativeButton("Cancel", new IDCListenerS77S0000000_2(0));
            return;
        }
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLILLLLZI;
        if (abstractBinderC172036p5 != null) {
            C171956ox.LIZ(abstractBinderC172036p5, 1022, CardStruct.IStatusCode.DEFAULT, null, null, null, 124);
        }
        super.onBackPressed();
    }

    @Override // X.AbstractActivityC171766oe
    public final C172126pE LLFZ() {
        return (C172126pE) findViewById(R.id.n46);
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLIIJLIL() {
        super.LLIIJLIL();
        XKX.LIZLLL(this, EXS.LIZ, null, new C172066p8(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    @Override // X.AbstractActivityC171766oe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIL() {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity.LLIL():void");
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLILLJJLI() {
        super.LLILLJJLI();
        runOnUiThread(new ARunnableS10S0101000_6(7, this, 2));
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLIZLLLIL() {
        super.LLIZLLLIL();
        runOnUiThread(new ARunnableS1S0001000_6(1, 13));
    }

    @Override // android.app.Activity
    public final void finish() {
        ImageView imageView = (ImageView) findViewById(R.id.n47);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        super.finish();
    }

    @Override // X.AbstractActivityC171766oe, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C172206pM c172206pM = this.LLIFFJFJJ;
        if (c172206pM != null) {
            ServiceConnectionC82880Wfs<INTERFACE> serviceConnectionC82880Wfs = c172206pM.LJLJJL;
            if (serviceConnectionC82880Wfs != 0) {
                c172206pM.LJLIL.unbindService(serviceConnectionC82880Wfs);
                serviceConnectionC82880Wfs.LJLIL.setValue(null);
            }
            c172206pM.LJLJJL = null;
        }
        this.LLIIII.getClass();
    }

    @Override // X.AbstractActivityC171766oe, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onResume", true);
        super.onResume();
        TextView textView = (TextView) findViewById(R.id.h0u);
        if (textView != null) {
            textView.setEnabled(true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC171766oe, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLIIJI(float f) {
        XKX.LIZLLL(this, EXS.LIZ, null, new C172096pB(this, f, null), 2);
    }

    @Override // X.AbstractActivityC171766oe
    public final Intent LLIILII(String outputFilePath) {
        o.LJIIIZ(outputFilePath, "outputFilePath");
        Intent LLIILII = super.LLIILII(outputFilePath);
        XKX.LIZLLL(this, EXS.LIZ, null, new C172086pA(this, null), 2);
        CutResultData cutResultData = new CutResultData(outputFilePath, CardStruct.IStatusCode.DEFAULT, null, null, null);
        this.LLIIII.getClass();
        CutResultData LIZ = CutResultData.LIZ(cutResultData, null, 27);
        this.LLIIII.getClass();
        CutResultData LIZ2 = CutResultData.LIZ(LIZ, null, 23);
        ArrayList<MediaItem> arrayList = this.LLD;
        if (arrayList != null) {
            LIZ2 = CutResultData.LIZ(LIZ2, new ArrayList(arrayList), 15);
        }
        LLIILII.putExtra("compile_data", LIZ2);
        LLIILII.putExtra("compile_file", outputFilePath);
        return LLIILII;
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLILLL(MediaItem mediaItem) {
        AbstractC029409q adapter;
        super.LLILLL(mediaItem);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.n6l);
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        C172196pL c172196pL = (C172196pL) adapter;
        Iterator it = ((ArrayList) c172196pL.LJLJI).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(((MediaItem) next).materialId, mediaItem.materialId)) {
                    ListProtector.set(c172196pL.LJLJI, i, mediaItem);
                    c172196pL.notifyItemChanged(i);
                    return;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLILZ(boolean z) {
        super.LLILZ(z);
        runOnUiThread(new ARunnableS8S0110000_2(this, z, 10));
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLJILJILJ(long j) {
        runOnUiThread(new ARunnableS11S0100100_2(this, j, 4));
    }

    @Override // X.AbstractActivityC171766oe, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onCreate", true);
        C172206pM c172206pM = new C172206pM(this);
        c172206pM.LIZIZ(null);
        this.LLIFFJFJJ = c172206pM;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(ColorProtector.parseColor("#000000"));
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity", "onCreate", false);
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLIIIZ(int i, String str) {
        super.LLIIIZ(i, str);
        XKX.LIZLLL(this, EXS.LIZ, null, new C172076p9(this, null), 2);
    }

    @Override // X.AbstractActivityC171766oe
    public final void LLILLIZIL(int i, String str) {
        super.LLILLIZIL(i, str);
        runOnUiThread(new ARunnableS12S0101000_8(4, this, 31));
    }
}
