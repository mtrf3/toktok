package com.google.android.gms.cast.framework.media;

import X.C16880lQ;
import X.C90215Zat;
import X.C90613ZhJ;
import X.C90639Zhj;
import X.DialogInterfaceOnClickListenerC90131ZYx;
import X.DialogInterfaceOnClickListenerC90132ZYy;
import X.ZYJ;
import X.ZZ0;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.fragment.app.DialogFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public class TracksChooserDialogFragment extends DialogFragment {
    public boolean LJLIL;
    public List<MediaTrack> LJLILLLLZI;
    public List<MediaTrack> LJLJI;
    public long[] LJLJJI;
    public Dialog LJLJJL;
    public C90639Zhj LJLJJLL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = true;
        this.LJLJI = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJI = new long[0];
        C90613ZhJ LIZJ = ZYJ.LIZIZ(getContext()).LIZ().LIZJ();
        if (LIZJ == null || !LIZJ.LIZJ()) {
            this.LJLIL = false;
            return;
        }
        C90639Zhj LJIIIIZZ = LIZJ.LJIIIIZZ();
        this.LJLJJLL = LJIIIIZZ;
        if (LJIIIIZZ == null || !LJIIIIZZ.LJIIIZ() || this.LJLJJLL.LJ() == null) {
            this.LJLIL = false;
            return;
        }
        C90639Zhj c90639Zhj = this.LJLJJLL;
        MediaStatus LJI = c90639Zhj.LJI();
        if (LJI != null) {
            this.LJLJJI = LJI.zzk;
        }
        MediaInfo LJ = c90639Zhj.LJ();
        if (LJ == null) {
            this.LJLIL = false;
            return;
        }
        List<MediaTrack> list = LJ.zzh;
        if (list == null) {
            this.LJLIL = false;
            return;
        }
        this.LJLJI = wl(2, list);
        ArrayList wl = wl(1, list);
        this.LJLILLLLZI = wl;
        if (!wl.isEmpty()) {
            List<MediaTrack> list2 = this.LJLILLLLZI;
            C90215Zat c90215Zat = new C90215Zat();
            c90215Zat.LIZIZ = mo49getActivity().getString(R.string.af);
            c90215Zat.LIZJ = 2;
            c90215Zat.LIZ = "";
            ListProtector.add(list2, 0, new MediaTrack(-1L, 1, c90215Zat.LIZ, null, c90215Zat.LIZIZ, null, c90215Zat.LIZJ, null, null));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        int vl = vl(0, this.LJLILLLLZI, this.LJLJJI);
        int vl2 = vl(-1, this.LJLJI, this.LJLJJI);
        ZZ0 zz0 = new ZZ0(vl, mo49getActivity(), this.LJLILLLLZI);
        ZZ0 zz02 = new ZZ0(vl2, mo49getActivity(), this.LJLJI);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo49getActivity());
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.e, mo49getActivity().getLayoutInflater(), null);
        ListView listView = (ListView) LLLZIIL.findViewById(R.id.bw);
        ListView listView2 = (ListView) LLLZIIL.findViewById(R.id.g);
        TabHost tabHost = (TabHost) LLLZIIL.findViewById(R.id.bu);
        tabHost.setup();
        if (zz0.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) zz0);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(R.id.bw);
            newTabSpec.setIndicator(mo49getActivity().getString(R.string.ah));
            tabHost.addTab(newTabSpec);
        }
        if (zz02.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) zz02);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(R.id.g);
            newTabSpec2.setIndicator(mo49getActivity().getString(R.string.ab));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(LLLZIIL).setPositiveButton(mo49getActivity().getString(R.string.ag), new DialogInterfaceOnClickListenerC90132ZYy(this, zz0, zz02)).setNegativeButton(R.string.ac, new DialogInterfaceOnClickListenerC90131ZYx(this));
        Dialog dialog = this.LJLJJL;
        if (dialog != null) {
            dialog.cancel();
            this.LJLJJL = null;
        }
        AlertDialog create = builder.create();
        this.LJLJJL = create;
        return create;
    }

    public static ArrayList wl(int i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaTrack mediaTrack = (MediaTrack) it.next();
            if (mediaTrack.zzc == i) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    public static int vl(int i, List list, long[] jArr) {
        if (jArr != null && list != null) {
            for (int i2 = 0; i2 < ((ArrayList) list).size(); i2++) {
                for (long j : jArr) {
                    if (j == ((MediaTrack) ListProtector.get(list, i2)).zzb) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }
}
