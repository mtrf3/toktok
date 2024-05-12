package com.zhihu.matisse.ui;

import X.AnonymousClass021;
import X.C011902x;
import X.C03O;
import X.C09N;
import X.C16880lQ;
import X.C19M;
import X.C1B3;
import X.C29S;
import X.C39386Fd0;
import X.C39647FhD;
import X.C48301IxV;
import X.C65803Ps7;
import X.C73110Smg;
import X.C78598Ut0;
import X.C80598VkA;
import X.C81027Vr5;
import X.C81047VrP;
import X.C81051VrT;
import X.C81052VrU;
import X.C81055VrX;
import X.InterfaceC81016Vqu;
import X.InterfaceC81042VrK;
import X.InterfaceC81043VrL;
import X.InterfaceC81045VrN;
import X.InterfaceC81049VrR;
import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhihu.matisse.internal.ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class MatisseActivity extends C29S implements InterfaceC81016Vqu, AdapterView.OnItemSelectedListener, InterfaceC81049VrR, View.OnClickListener, InterfaceC81045VrN, InterfaceC81042VrK, InterfaceC81043VrL {
    public final C81047VrP LJLIL = new C81047VrP();
    public final C81051VrT LJLILLLLZI = new C81051VrT(this);
    public C81052VrU LJLJI;
    public C80598VkA LJLJJI;
    public C81027Vr5 LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public LinearLayout LJLL;
    public C73110Smg LJLLI;
    public boolean LJLLILLLL;

    @Override // X.InterfaceC81043VrL
    public final void LJIL() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
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

    public final void LLFZ() {
        int size = this.LJLILLLLZI.LIZIZ.size();
        if (size == 0) {
            this.LJLJJLL.setEnabled(false);
            this.LJLJL.setEnabled(false);
            this.LJLJL.setText(getString(R.string.i0x));
        } else {
            if (size == 1) {
                C81052VrU c81052VrU = this.LJLJI;
                if (!c81052VrU.LJFF && c81052VrU.LJI == 1) {
                    this.LJLJJLL.setEnabled(true);
                    this.LJLJL.setText(R.string.i0x);
                    this.LJLJL.setEnabled(true);
                }
            }
            this.LJLJJLL.setEnabled(true);
            this.LJLJL.setEnabled(true);
            this.LJLJL.setText(getString(R.string.i0w, Integer.valueOf(size)));
        }
        this.LJLJI.getClass();
        this.LJLL.setVisibility(4);
    }

    @Override // X.InterfaceC81045VrN
    public final void LJIILLIIL() {
        LLFZ();
        this.LJLJI.getClass();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C81047VrP c81047VrP = this.LJLIL;
        C09N c09n = c81047VrP.LIZIZ;
        if (c09n != null) {
            c09n.LIZ(1);
        }
        c81047VrP.LIZJ = null;
        this.LJLJI.getClass();
        this.LJLJI.getClass();
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

    @Override // X.InterfaceC81049VrR
    public final C81051VrT LJJJI() {
        return this.LJLILLLLZI;
    }

    public final void LLFII(Album album) {
        if (album.LIZIZ() && album.mCount == 0) {
            this.LJLJLJ.setVisibility(8);
            this.LJLJLLL.setVisibility(0);
            return;
        }
        this.LJLJLJ.setVisibility(0);
        this.LJLJLLL.setVisibility(8);
        MediaSelectionFragment mediaSelectionFragment = new MediaSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", album);
        mediaSelectionFragment.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(mediaSelectionFragment, C16880lQ.LJLLJ(MediaSelectionFragment.class), R.id.bs8);
        c1b3.LJI();
    }

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LIZLLL(LIZ);
        super.attachBaseContext(LIZ);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.b2b) {
            Intent intent = new Intent(this, (Class<?>) SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.LJLILLLLZI.LIZJ());
            intent.putExtra("extra_result_original_enable", this.LJLLILLLL);
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, 23);
            return;
        }
        if (view.getId() == R.id.b1w) {
            Intent intent2 = new Intent();
            C81051VrT c81051VrT = this.LJLILLLLZI;
            c81051VrT.getClass();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<Item> it = c81051VrT.LIZIZ.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().uri);
            }
            intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
            intent2.putExtra("extra_result_original_enable", this.LJLLILLLL);
            setResult(-1, intent2);
            finish();
            return;
        }
        if (view.getId() != R.id.hdo) {
            return;
        }
        int size = this.LJLILLLLZI.LIZIZ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C81051VrT c81051VrT2 = this.LJLILLLLZI;
            c81051VrT2.getClass();
            Item item = (Item) ListProtector.get(new ArrayList(c81051VrT2.LIZIZ), i2);
            if (item.LIZIZ() && C48301IxV.LIZ(item.size) > this.LJLJI.LJIIJJI) {
                i++;
            }
        }
        if (i > 0) {
            IncapableDialog.vl("", getString(R.string.i13, Integer.valueOf(i), Integer.valueOf(this.LJLJI.LJIIJJI))).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            return;
        }
        boolean z = true ^ this.LJLLILLLL;
        this.LJLLILLLL = z;
        this.LJLLI.setChecked(z);
        this.LJLJI.getClass();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        C81052VrU c81052VrU = C81055VrX.LIZ;
        this.LJLJI = c81052VrU;
        setTheme(c81052VrU.LIZLLL);
        super.onCreate(bundle);
        if (!this.LJLJI.LJIIJ) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.el);
        int i = this.LJLJI.LJ;
        if (i != -1) {
            setRequestedOrientation(i);
        }
        this.LJLJI.getClass();
        C011902x c011902x = (C011902x) findViewById(R.id.lcn);
        setSupportActionBar(c011902x);
        AnonymousClass021 supportActionBar = getSupportActionBar();
        supportActionBar.LJIILJJIL();
        supportActionBar.LJIILIIL(true);
        Drawable navigationIcon = c011902x.getNavigationIcon();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.v_});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.LJLJJLL = (TextView) findViewById(R.id.b2b);
        this.LJLJL = (TextView) findViewById(R.id.b1w);
        C16880lQ.LJIJI(this.LJLJJLL, this);
        C16880lQ.LJIJI(this.LJLJL, this);
        this.LJLJLJ = findViewById(R.id.bs8);
        this.LJLJLLL = findViewById(R.id.cvu);
        this.LJLL = (LinearLayout) findViewById(R.id.hdo);
        this.LJLLI = (C73110Smg) findViewById(R.id.hdn);
        C16880lQ.LJIIZILJ(this.LJLL, this);
        this.LJLILLLLZI.LJFF(bundle);
        if (bundle != null) {
            this.LJLLILLLL = bundle.getBoolean("checkState");
        }
        LLFZ();
        this.LJLJJL = new C81027Vr5(this);
        C80598VkA c80598VkA = new C80598VkA(this);
        this.LJLJJI = c80598VkA;
        c80598VkA.LIZLLL = this;
        TextView textView = (TextView) findViewById(R.id.jma);
        c80598VkA.LIZIZ = textView;
        Drawable drawable = textView.getCompoundDrawables()[2];
        TypedArray obtainStyledAttributes2 = c80598VkA.LIZIZ.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.v_});
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        drawable.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        c80598VkA.LIZIZ.setVisibility(8);
        C16880lQ.LJIJI(c80598VkA.LIZIZ, new ACListenerS34S0100000_14(c80598VkA, 93));
        final TextView textView2 = c80598VkA.LIZIZ;
        final C19M c19m = c80598VkA.LIZJ;
        c19m.getClass();
        textView2.setOnTouchListener(new C03O(textView2) { // from class: X.19J
            @Override // X.C03O
            public final /* bridge */ /* synthetic */ AnonymousClass112 LIZIZ() {
                return C19M.this;
            }
        });
        this.LJLJJI.LIZJ.LJLLLL = findViewById(R.id.lcn);
        C80598VkA c80598VkA2 = this.LJLJJI;
        C81027Vr5 c81027Vr5 = this.LJLJJL;
        c80598VkA2.LIZJ.LJIILIIL(c81027Vr5);
        c80598VkA2.LIZ = c81027Vr5;
        C81047VrP c81047VrP = this.LJLIL;
        c81047VrP.getClass();
        c81047VrP.LIZ = new WeakReference<>(this);
        c81047VrP.LIZIZ = getSupportLoaderManager();
        c81047VrP.LIZJ = this;
        C81047VrP c81047VrP2 = this.LJLIL;
        c81047VrP2.getClass();
        if (bundle != null) {
            c81047VrP2.LIZLLL = bundle.getInt("state_current_selection");
        }
        C81047VrP c81047VrP3 = this.LJLIL;
        c81047VrP3.LIZIZ.LIZJ(1, null, c81047VrP3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C81051VrT c81051VrT = this.LJLILLLLZI;
        c81051VrT.getClass();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(c81051VrT.LIZIZ));
        bundle.putInt("state_collection_type", c81051VrT.LIZJ);
        bundle.putInt("state_current_selection", this.LJLIL.LIZLLL);
        bundle.putBoolean("checkState", this.LJLLILLLL);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 23) {
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "extra_result_bundle");
            ArrayList parcelableArrayList = LJJLIIIIJ.getParcelableArrayList("state_selection");
            this.LJLLILLLL = intent.getBooleanExtra("extra_result_original_enable", false);
            int i3 = LJJLIIIIJ.getInt("state_collection_type", 0);
            if (intent.getBooleanExtra("extra_result_apply", false)) {
                Intent intent2 = new Intent();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                if (parcelableArrayList != null) {
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Item) it.next()).uri);
                    }
                }
                intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                intent2.putExtra("extra_result_original_enable", this.LJLLILLLL);
                setResult(-1, intent2);
                finish();
                return;
            }
            C81051VrT c81051VrT = this.LJLILLLLZI;
            c81051VrT.getClass();
            if (parcelableArrayList.size() == 0) {
                c81051VrT.LIZJ = 0;
            } else {
                c81051VrT.LIZJ = i3;
            }
            c81051VrT.LIZIZ.clear();
            c81051VrT.LIZIZ.addAll(parcelableArrayList);
            Fragment LJJJIL = getSupportFragmentManager().LJJJIL(C16880lQ.LJLLJ(MediaSelectionFragment.class));
            if (LJJJIL instanceof MediaSelectionFragment) {
                ((MediaSelectionFragment) LJJJIL).LJLJI.notifyDataSetChanged();
            }
            LLFZ();
            return;
        }
        if (i != 24) {
        } else {
            throw null;
        }
    }

    @Override // X.InterfaceC81042VrK
    public final void rf(Album album, Item item, int i) {
        Intent intent = new Intent(this, (Class<?>) AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.LJLILLLLZI.LIZJ());
        intent.putExtra("extra_result_original_enable", this.LJLLILLLL);
        C78598Ut0.LJIJJ(intent, this);
        startActivityForResult(intent, 23);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.LJLIL.LIZLLL = i;
        this.LJLJJL.getCursor().moveToPosition(i);
        Album LIZLLL = Album.LIZLLL(this.LJLJJL.getCursor());
        LIZLLL.LIZIZ();
        LLFII(LIZLLL);
    }
}
