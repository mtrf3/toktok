package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.ZYy, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class DialogInterfaceOnClickListenerC90132ZYy implements DialogInterface.OnClickListener {
    public final /* synthetic */ ZZ0 LJLIL;
    public final /* synthetic */ ZZ0 LJLILLLLZI;
    public final /* synthetic */ TracksChooserDialogFragment LJLJI;

    public DialogInterfaceOnClickListenerC90132ZYy(TracksChooserDialogFragment tracksChooserDialogFragment, ZZ0 zz0, ZZ0 zz02) {
        this.LJLJI = tracksChooserDialogFragment;
        this.LJLIL = zz0;
        this.LJLILLLLZI = zz02;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MediaTrack item;
        MediaTrack item2;
        TracksChooserDialogFragment tracksChooserDialogFragment = this.LJLJI;
        ZZ0 zz0 = this.LJLIL;
        ZZ0 zz02 = this.LJLILLLLZI;
        if (!tracksChooserDialogFragment.LJLIL) {
            Dialog dialog = tracksChooserDialogFragment.LJLJJL;
            if (dialog != null) {
                dialog.cancel();
                tracksChooserDialogFragment.LJLJJL = null;
                return;
            }
            return;
        }
        C90639Zhj c90639Zhj = tracksChooserDialogFragment.LJLJJLL;
        QH7.LJIIIIZZ(c90639Zhj);
        if (!c90639Zhj.LJIIIZ()) {
            Dialog dialog2 = tracksChooserDialogFragment.LJLJJL;
            if (dialog2 == null) {
                return;
            }
            dialog2.cancel();
            tracksChooserDialogFragment.LJLJJL = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = zz0.LJLILLLLZI;
        if (i2 >= 0 && i2 < zz0.getCount() && (item2 = zz0.getItem(zz0.LJLILLLLZI)) != null) {
            long j = item2.zzb;
            if (j != -1) {
                arrayList.add(Long.valueOf(j));
            }
        }
        int i3 = zz02.LJLILLLLZI;
        if (i3 >= 0 && i3 < zz02.getCount() && (item = zz02.getItem(zz02.LJLILLLLZI)) != null) {
            arrayList.add(Long.valueOf(item.zzb));
        }
        long[] jArr = tracksChooserDialogFragment.LJLJJI;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            Iterator it = ((ArrayList) tracksChooserDialogFragment.LJLJI).iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it.next()).zzb));
            }
            Iterator it2 = ((ArrayList) tracksChooserDialogFragment.LJLILLLLZI).iterator();
            while (it2.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it2.next()).zzb));
            }
            for (long j2 : jArr) {
                Long valueOf = Long.valueOf(j2);
                if (!hashSet.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            jArr2[i4] = ((Long) ListProtector.get(arrayList, i4)).longValue();
        }
        Arrays.sort(jArr2);
        QH7.LJ("Must be called from the main thread.");
        if (!c90639Zhj.LJJIII()) {
            C90639Zhj.LJIJJLI();
        } else {
            C90639Zhj.LJJIIJ(new C90917ZmD(c90639Zhj, jArr2));
        }
        Dialog dialog3 = tracksChooserDialogFragment.LJLJJL;
        if (dialog3 == null) {
            return;
        }
        dialog3.cancel();
        tracksChooserDialogFragment.LJLJJL = null;
    }
}
