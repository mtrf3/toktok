package com.zhihu.matisse.internal.ui;

import X.AbstractViewOnClickListenerC81050VrS;
import X.C09N;
import X.C65803Ps7;
import X.C80645Vkv;
import X.C81046VrO;
import X.C81055VrX;
import X.InterfaceC81048VrQ;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.entity.Item;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class AlbumPreviewActivity extends AbstractViewOnClickListenerC81050VrS implements InterfaceC81048VrQ {
    public final C81046VrO LJLLLL = new C81046VrO();
    public boolean LJLLLLLL;

    @Override // X.InterfaceC81048VrQ
    public final void i3() {
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C81046VrO c81046VrO = this.LJLLLL;
        C09N c09n = c81046VrO.LIZIZ;
        if (c09n != null) {
            c09n.LIZ(2);
        }
        c81046VrO.LIZJ = null;
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.AbstractViewOnClickListenerC81050VrS, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (!C81055VrX.LIZ.LJIIJ) {
            setResult(0);
            finish();
            return;
        }
        C81046VrO c81046VrO = this.LJLLLL;
        c81046VrO.getClass();
        c81046VrO.LIZ = new WeakReference<>(this);
        c81046VrO.LIZIZ = getSupportLoaderManager();
        c81046VrO.LIZJ = this;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_album");
        C81046VrO c81046VrO2 = this.LJLLLL;
        c81046VrO2.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("args_album", parcelableExtra);
        bundle2.putBoolean("args_enable_capture", false);
        c81046VrO2.LIZIZ.LIZJ(2, bundle2, c81046VrO2);
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.LJLILLLLZI.LJFF) {
            this.LJLJJL.setCheckedNum(this.LJLIL.LIZIZ(item));
        } else {
            this.LJLJJL.setChecked(this.LJLIL.LIZIZ.contains(item));
        }
        LLII(item);
    }

    @Override // X.InterfaceC81048VrQ
    public final void rd(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(Item.LJ(cursor));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C80645Vkv c80645Vkv = (C80645Vkv) this.LJLJI.getAdapter();
        c80645Vkv.LJLJJLL.addAll(arrayList);
        c80645Vkv.notifyDataSetChanged();
        if (!this.LJLLLLLL) {
            this.LJLLLLLL = true;
            int indexOf = arrayList.indexOf(getIntent().getParcelableExtra("extra_item"));
            this.LJLJI.setCurrentItem(indexOf, false);
            this.LJLJLLL = indexOf;
        }
    }
}
