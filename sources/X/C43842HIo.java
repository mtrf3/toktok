package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import kotlin.jvm.internal.o;

/* renamed from: X.HIo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43842HIo extends F9E {
    public final AbstractC65743Pr9<AVMusicWaveBean> LJLIL;
    public final AbstractC65743Pr9<MultiEditVideoStatusRecordData> LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C43842HIo(AbstractC65743Pr9<AVMusicWaveBean> avMusicWaveBean, AbstractC65743Pr9<MultiEditVideoStatusRecordData> multiEditVideoStatusRecordData, Object concatFinishedEvent) {
        o.LJIIIZ(avMusicWaveBean, "avMusicWaveBean");
        o.LJIIIZ(multiEditVideoStatusRecordData, "multiEditVideoStatusRecordData");
        o.LJIIIZ(concatFinishedEvent, "concatFinishedEvent");
        this.LJLIL = avMusicWaveBean;
        this.LJLILLLLZI = multiEditVideoStatusRecordData;
        this.LJLJI = concatFinishedEvent;
    }
}
