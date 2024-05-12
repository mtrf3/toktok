package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.OlY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62848OlY {
    public static boolean LIZJ() {
        try {
            if (C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), EF7.LIZIZ()) == 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean LIZLLL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        Integer M = privacyUserSettingsV2.M("private_account");
        if (M == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static void LJ(SearchApiResult data) {
        String str;
        o.LJIIIZ(data, "data");
        if (TextUtils.isEmpty(data.getRequestId())) {
            LogPbBean logPbBean = data.logPb;
            if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                str = "";
            }
            data.setRequestId(str);
        }
        C3A5.LIZ.LJFF(data.getRequestId(), data.logPb);
        QueryCorrectInfo queryCorrectInfo = data.queryCorrectInfo;
        if (queryCorrectInfo == null) {
            return;
        }
        queryCorrectInfo.setRequestId(data.getRequestId());
    }

    public static final byte[] LJFF(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(FileUtils.BUFFER_SIZE, inputStream.available()));
        LIZIZ(inputStream, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o.LJIIIIZZ(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.2LD] */
    public static final C2LD LJI(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI());
        if (nLESegmentAudio == null) {
            return null;
        }
        final long startTime = nLETrackSlot.getStartTime();
        final long endTime = nLETrackSlot.getEndTime();
        final String LIZJ = nLESegmentAudio.LJ().LIZJ();
        o.LJIIIIZZ(LIZJ, "it.avFile.resourceFile");
        final long LJIILIIL = nLESegmentAudio.LJIILIIL();
        final long LJIIL = nLESegmentAudio.LJIIL();
        final float LJIILJJIL = nLESegmentAudio.LJIILJJIL();
        final boolean LJJJJI = C124574uj.LJJJJI(nLETrackSlot);
        return new F9E(startTime, endTime, LIZJ, LJIILIIL, LJIIL, LJIILJJIL, LJJJJI) { // from class: X.2LD
            public final long LJLIL;
            public final long LJLILLLLZI;
            public final String LJLJI;
            public final long LJLJJI;
            public final long LJLJJL;
            public final float LJLJJLL;
            public final boolean LJLJL;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), this.LJLJI, Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Float.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL)};
            }

            {
                this.LJLIL = startTime;
                this.LJLILLLLZI = endTime;
                this.LJLJI = LIZJ;
                this.LJLJJI = LJIILIIL;
                this.LJLJJL = LJIIL;
                this.LJLJJLL = LJIILJJIL;
                this.LJLJL = LJJJJI;
            }
        };
    }

    public static final CancellationException LIZ(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final long LIZIZ(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
