package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import kotlin.jvm.internal.AqS135S0200000_4;

/* renamed from: X.6dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164866dW extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, Integer, Intent, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ SeriesPostUIAssem LJLILLLLZI;
    public final /* synthetic */ C68322mC<VideoPublishEditModel> LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164866dW(boolean z, SeriesPostUIAssem seriesPostUIAssem, C68322mC<VideoPublishEditModel> c68322mC, ActivityC45651qj activityC45651qj) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = seriesPostUIAssem;
        this.LJLJI = c68322mC;
        this.LJLJJI = activityC45651qj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel] */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Integer num, Integer num2, Intent intent) {
        VideoPublishEditModel videoPublishEditModel;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        Intent intent2 = intent;
        if (intValue == 4 && intValue2 == -1) {
            if (this.LJLIL) {
                SeriesPostUIAssem seriesPostUIAssem = this.LJLILLLLZI;
                VideoPublishEditModel videoPublishEditModel2 = seriesPostUIAssem.x3().LJLIL;
                if (videoPublishEditModel2 != null) {
                    AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(seriesPostUIAssem, videoPublishEditModel2, 131);
                    ActivityC45651qj LIZ = C212428Vi.LIZ(seriesPostUIAssem);
                    if (LIZ != null) {
                        aqS135S0200000_4.invoke(LIZ);
                    }
                }
            }
            C42326GjK.LIZ.getClass();
            C42326GjK.LIZLLL(intent2);
            if (intent2 != null) {
                Serializable serializableExtra = intent2.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
                if ((serializableExtra instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) serializableExtra) != null) {
                    videoPublishEditModel.creativeModel = C78996UzQ.LJIILL(intent2);
                    this.LJLILLLLZI.x3().LJLIL = videoPublishEditModel;
                    C68322mC<VideoPublishEditModel> c68322mC = this.LJLJI;
                    ?? r0 = this.LJLILLLLZI.x3().LJLIL;
                    if (r0 != 0) {
                        c68322mC.element = r0;
                        if (C142985jK.LIZ() && !H7R.LJJLIIIJJIZ(this.LJLJI.element)) {
                            ActivityC45651qj activityC45651qj = this.LJLJJI;
                            VideoPublishEditModel videoPublishEditModel3 = this.LJLJI.element;
                            C164096cH c164096cH = this.LJLILLLLZI.LJLJJI;
                            if (c164096cH != null) {
                                C162236Yh.LJFF(activityC45651qj, c164096cH, videoPublishEditModel3);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            C162236Yh.LJ(this.LJLJJI, this.LJLJI.element, false, this.LJLILLLLZI.LJLJJI, new C78842Uww());
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
