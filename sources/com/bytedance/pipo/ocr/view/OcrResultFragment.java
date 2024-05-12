package com.bytedance.pipo.ocr.view;

import X.C76800UCe;
import X.C78851Ux5;
import X.C86321XuH;
import X.InterfaceC65784Pro;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.pipo.ocr.ocr.OcrResultViewModel;
import kotlin.jvm.internal.o;
import yi2.b;

/* loaded from: classes16.dex */
public class OcrResultFragment extends Fragment {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public b LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public OcrResultViewModel LJLJI;
    public C86321XuH LJLJJI;
    public final long LJLJJL = System.currentTimeMillis();
    public View LJLJJLL;
    public LinearLayoutCompat LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;

    public static final /* synthetic */ OcrResultViewModel vl(OcrResultFragment ocrResultFragment) {
        OcrResultViewModel ocrResultViewModel = ocrResultFragment.LJLJI;
        if (ocrResultViewModel != null) {
            return ocrResultViewModel;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewModel viewModel = new ViewModelProvider(this, new C78851Ux5()).get(OcrResultViewModel.class);
        o.LJIIIIZZ(viewModel, "ViewModelProvider(\n     …ultViewModel::class.java)");
        this.LJLJI = (OcrResultViewModel) viewModel;
    }

    public final int wl(float f) {
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ocr.view.OcrResultFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
