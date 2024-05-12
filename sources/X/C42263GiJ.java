package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GiJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42263GiJ extends AbstractC42266GiM<Intent> {
    public final ActivityC45651qj LIZ;
    public final ShortVideoContext LIZIZ;
    public final ArrayList<MediaModel> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;

    public C42263GiJ(ActivityC45651qj activity, ShortVideoContext shortVideoContext, ArrayList<MediaModel> selectedMediaData, boolean z, InterfaceC65784Pro<C76800UCe> success, InterfaceC65784Pro<C76800UCe> failure) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(selectedMediaData, "selectedMediaData");
        o.LJIIIZ(success, "success");
        o.LJIIIZ(failure, "failure");
        this.LIZ = activity;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = selectedMediaData;
        this.LIZLLL = z;
        this.LJ = success;
        this.LJFF = failure;
    }
}
