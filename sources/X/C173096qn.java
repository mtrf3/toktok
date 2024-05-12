package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173096qn implements InterfaceC45496HtM {
    public final Activity LIZ;
    public C171856on LIZIZ;
    public CutsameDataItem LIZJ;

    @Override // X.InterfaceC45496HtM
    public final ArrayList<CutSameVideoImageExtraData> LIZJ() {
        ArrayList<MediaItem> arrayList;
        C171856on c171856on = this.LIZIZ;
        if (c171856on != null) {
            arrayList = c171856on.LIZ;
        } else {
            arrayList = null;
        }
        if (C38891fp.LJJI(arrayList)) {
            return null;
        }
        ArrayList<CutSameVideoImageExtraData> arrayList2 = new ArrayList<>();
        C171856on c171856on2 = this.LIZIZ;
        o.LJI(c171856on2);
        Iterator<MediaItem> it = c171856on2.LIZ.iterator();
        while (it.hasNext()) {
            arrayList2.add(new CutSameVideoImageExtraData(it.next().duration));
        }
        return arrayList2;
    }

    @Override // X.InterfaceC45496HtM
    public final Integer LIZIZ() {
        CutsameDataItem LIZIZ = C173046qi.LIZIZ();
        if (LIZIZ != null) {
            return Integer.valueOf(LIZIZ.isMvAnchor);
        }
        return null;
    }

    @Override // X.InterfaceC45496HtM
    public final String LJFF() {
        CutsameDataItem LIZIZ = C173046qi.LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.templateId;
        }
        return null;
    }

    public C173096qn(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC45496HtM
    public final void LJ(Intent intent) {
        ArrayList<MediaItem> arrayList;
        C171856on c171856on = this.LIZIZ;
        ArrayList<MediaItem> arrayList2 = null;
        if (c171856on != null) {
            arrayList = c171856on.LIZ;
        } else {
            arrayList = null;
        }
        if (!C38891fp.LJJI(arrayList)) {
            C171856on c171856on2 = this.LIZIZ;
            if (c171856on2 != null) {
                arrayList2 = c171856on2.LIZ;
            }
            intent.putParcelableArrayListExtra("key_cutsame_data", arrayList2);
        }
        CutsameDataItem cutsameDataItem = this.LIZJ;
        if (cutsameDataItem != null) {
            intent.putExtra("Key_cutsame_item", cutsameDataItem);
        }
    }

    public final void LJI(Intent intent, C173766rs c173766rs) {
        C171856on LIZIZ = C171886oq.LIZIZ(intent);
        CutsameDataItem cutsameDataItem = (CutsameDataItem) intent.getParcelableExtra("Key_cutsame_item");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "picker_mode");
        if (LIZIZ == null || cutsameDataItem == null || LLJJIJIIJIL == null || LIZIZ.LIZ.size() <= 0) {
            c173766rs.LIZ();
            return;
        }
        EnumC172856qP valueOf = EnumC172856qP.valueOf(LLJJIJIIJIL);
        this.LIZIZ = LIZIZ;
        this.LIZJ = cutsameDataItem;
        if (valueOf == EnumC172856qP.SINGLE) {
            c173766rs.LIZIZ(2, 1);
            return;
        }
        if (valueOf != EnumC172856qP.MULTI) {
            return;
        }
        ArrayList<MediaItem> arrayList = LIZIZ.LIZ;
        if (C38891fp.LJJI(arrayList)) {
            c173766rs.LIZ();
        } else {
            c173766rs.LIZIZ(1, arrayList.size());
        }
    }

    @Override // X.InterfaceC45496HtM
    public final boolean LIZLLL(Context context, InterfaceC45480Ht6 interfaceC45480Ht6, MediaModel mediaModel) {
        CutSameVideoImageExtraData LJJIFFI;
        if (this.LIZ == null) {
            return false;
        }
        if (interfaceC45480Ht6 == null || mediaModel == null || !mediaModel.LJI() || (LJJIFFI = interfaceC45480Ht6.LJJIFFI()) == null) {
            return true;
        }
        long j = mediaModel.duration;
        long j2 = LJJIFFI.extraDuration;
        if (j >= j2) {
            return true;
        }
        if (context == null) {
            return false;
        }
        String string = this.LIZ.getString(R.string.iju, Float.valueOf(((float) j2) / 1000.0f));
        o.LJIIIIZZ(string, "activity.getString(R.str….extraDuration / 1000.0f)");
        Activity activity = this.LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activity, 1023, creativeToastBuilder);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6qm] */
    @Override // X.InterfaceC45496HtM
    public final void LIZ(final Activity activity, final int i, final int i2, final Intent intent) {
        final CutsameDataItem cutsameDataItem = this.LIZJ;
        new Object(activity, i, i2, intent, cutsameDataItem) { // from class: X.6qm
            public final Activity LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final Intent LIZLLL;
            public final CutsameDataItem LJ;

            /* JADX WARN: Removed duplicated region for block: B:100:0x024a  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0274  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x02cf  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x02db  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x02e2  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x02e5  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C76800UCe LIZ() {
                /*
                    Method dump skipped, instructions count: 1583
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C173086qm.LIZ():X.UCe");
            }

            public static void LIZIZ(Activity activity2) {
                C24540xm.LIZ(R.string.g5r, activity2, 1025);
            }

            {
                this.LIZ = activity;
                this.LIZIZ = i;
                this.LIZJ = i2;
                this.LIZLLL = intent;
                this.LJ = cutsameDataItem;
            }
        }.LIZ();
    }
}
