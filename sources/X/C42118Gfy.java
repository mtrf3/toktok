package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS37S0301000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42118Gfy implements InterfaceC45242HpG {
    public final Activity LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final InterfaceC42119Gfz LIZLLL;

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
        this.LIZLLL.LJ(0, true);
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
        this.LIZLLL.dismissDialog();
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
        this.LIZLLL.LIZIZ(i);
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        long j;
        String str;
        String str2;
        int i2;
        boolean z;
        int i3;
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        Activity activity = this.LIZ;
        if (C42117Gfx.LJ()) {
            j = 0;
        } else {
            j = this.LIZIZ;
        }
        OSJ LIZ = C41994Gdy.LIZ(activity, parcelableArrayListExtra, j, this.LIZJ);
        ((Boolean) LIZ.getFirst()).booleanValue();
        int intValue = ((Number) LIZ.getSecond()).intValue();
        long longValue = ((Number) LIZ.getThird()).longValue();
        int size = parcelableArrayListExtra.size() - intValue;
        String str3 = "";
        if (intValue == 0) {
            if (size >= 1) {
                str = "photo";
            }
            str = "";
        } else {
            if (intValue >= 1) {
                if (size == 0) {
                    str = "video";
                } else if (size >= 1) {
                    str = "mix";
                }
            }
            str = "";
        }
        if (parcelableArrayListExtra.size() > 1) {
            str2 = "multiple_content";
        } else {
            str2 = "single_content";
        }
        if (intValue > 0) {
            i2 = intValue;
        } else {
            i2 = 0;
        }
        int size2 = parcelableArrayListExtra.size() - intValue;
        if (parcelableArrayListExtra.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        String str4 = str;
        H9N h9n = new H9N(null, str, str2, i2, size2, str4, z, C173606rc.LIZ(parcelableArrayListExtra), true, data.getBooleanExtra("is_pip", false), data.getBooleanExtra("Key_replace_item", false), C79081V1x.LJIIZILJ(parcelableArrayListExtra));
        if (longValue > 0) {
            i3 = (int) longValue;
        } else {
            i3 = 0;
        }
        h9n.LIZ.LIZ(i3, "duration_ms");
        h9n.LIZ.LIZ(i3, "creation_duration");
        C145995oB c145995oB = h9n.LIZ;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(data, "shoot_way");
        if (LLJJIJIIJIL != null) {
            str3 = LLJJIJIIJIL;
        }
        c145995oB.getClass();
        c145995oB.LJI("shoot_way", str3);
        c145995oB.LJI("creation_id", C77412UZs.LJIJI(data).getCreationId());
        c145995oB.LJI("creation_id", C77412UZs.LJIJI(data).getCreationId());
        c145995oB.LJI("upload_method", "click_button");
        c145995oB.LIZLLL("upload_next_method", C16880lQ.LLJJIJIIJIL(data, "upload_next_method"));
        h9n.LIZ();
        this.LIZLLL.LIZLLL(parcelableArrayListExtra, data, false, new AqS37S0301000_7((List) parcelableArrayListExtra, (List<? extends MediaModel>) data, (Intent) this, (C42118Gfy) i, 1));
    }

    public C42118Gfy(Activity activity, long j, long j2) {
        this.LIZ = activity;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = C60903NvH.LJIIJJI().LJJIJIL().LIZIZ(activity, j, j2);
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> selectedMediaList, CreativeInfo creativeInfo, boolean z) {
        o.LJIIIZ(selectedMediaList, "selectedMediaList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return this.LIZLLL.LIZJ(selectedMediaList, creativeInfo, z);
    }
}
