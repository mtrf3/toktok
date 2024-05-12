package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.twitter.sdk.android.core.internal.scribe.ScribeEvent;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PiA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65186PiA implements KO5<ScribeEvent> {
    public final Context LJLIL;
    public final AbstractC65185Pi9<ScribeEvent> LJLILLLLZI;
    public final ScheduledExecutorService LJLJI;
    public final AtomicReference<ScheduledFuture<?>> LJLJJI = new AtomicReference<>();
    public volatile int LJLJJL;
    public final ScribeFilesSender LJLJJLL;

    @Override // X.KO5
    public final boolean LIZ() {
        try {
            return this.LJLILLLLZI.LIZIZ();
        } catch (IOException unused) {
            C78841Uwv.LJJI(this.LJLIL);
            return false;
        }
    }

    @Override // X.KO5
    public final void LIZJ() {
        long longValue;
        ScribeFilesSender scribeFilesSender = this.LJLJJLL;
        if (scribeFilesSender == null) {
            C78841Uwv.LJJ(this.LJLIL);
            return;
        }
        C78841Uwv.LJJ(this.LJLIL);
        List<File> LIZ = this.LJLILLLLZI.LIZ();
        int i = 0;
        while (LIZ.size() > 0) {
            try {
                Context context = this.LJLIL;
                C16880lQ.LLLZI(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(LIZ.size())});
                C78841Uwv.LJJ(context);
                if (!scribeFilesSender.LJ(LIZ)) {
                    break;
                }
                i += LIZ.size();
                ((C65188PiC) this.LJLILLLLZI.LIZLLL).LIZ(LIZ);
                LIZ = this.LJLILLLLZI.LIZ();
            } catch (Exception e) {
                Context context2 = this.LJLIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Failed to send batch of analytics files to server: ");
                LIZ2.append(e.getMessage());
                X1D.LIZIZ(LIZ2);
                C78841Uwv.LJJI(context2);
            }
        }
        if (i != 0) {
            return;
        }
        AbstractC65185Pi9<ScribeEvent> abstractC65185Pi9 = this.LJLILLLLZI;
        List<File> asList = Arrays.asList(((C65188PiC) abstractC65185Pi9.LIZLLL).LIZLLL.listFiles());
        int i2 = abstractC65185Pi9.LJ;
        if (asList.size() <= i2) {
            return;
        }
        int size = asList.size() - i2;
        Context context3 = abstractC65185Pi9.LIZ;
        C16880lQ.LLLZI(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(asList.size()), Integer.valueOf(i2), Integer.valueOf(size)});
        C78841Uwv.LJJ(context3);
        TreeSet treeSet = new TreeSet(new F2D(1));
        for (File file : asList) {
            String[] split = file.getName().split("_");
            if (split.length == 3) {
                try {
                    longValue = CastLongProtector.valueOf(split[2]).longValue();
                } catch (NumberFormatException unused) {
                }
                treeSet.add(new C65193PiH(file, longValue));
            }
            longValue = 0;
            treeSet.add(new C65193PiH(file, longValue));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C65193PiH) it.next()).LIZ);
            if (arrayList.size() == size) {
                break;
            }
        }
        ((C65188PiC) abstractC65185Pi9.LIZLLL).LIZ(arrayList);
    }

    @Override // X.KO5
    public final void LJIIL() {
        if (this.LJLJJI.get() != null) {
            C78841Uwv.LJJ(this.LJLIL);
            this.LJLJJI.get().cancel(false);
            this.LJLJJI.set(null);
        }
    }

    @Override // X.KO5
    public final void LJIIIIZZ(ScribeEvent scribeEvent) {
        Context context = this.LJLIL;
        scribeEvent.toString();
        C78841Uwv.LJJ(context);
        try {
            this.LJLILLLLZI.LIZJ(scribeEvent);
        } catch (IOException unused) {
            C78841Uwv.LJJI(this.LJLIL);
        }
        if (this.LJLJJL != -1) {
            LIZIZ(this.LJLJJL, this.LJLJJL);
        }
    }

    public final void LIZIZ(long j, long j2) {
        if (this.LJLJJI.get() == null) {
            Context context = this.LJLIL;
            KO6 ko6 = new KO6(context, this);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Scheduling time based file roll over every ");
            LIZ.append(j2);
            LIZ.append(" seconds");
            X1D.LIZIZ(LIZ);
            C78841Uwv.LJJ(context);
            try {
                this.LJLJJI.set(this.LJLJI.scheduleAtFixedRate(ko6, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                C78841Uwv.LJJI(this.LJLIL);
            }
        }
    }

    public C65186PiA(Context context, ScheduledExecutorService scheduledExecutorService, C65190PiE c65190PiE, C65077PgP c65077PgP, ScribeFilesSender scribeFilesSender) {
        this.LJLJJL = -1;
        this.LJLIL = context;
        this.LJLJI = scheduledExecutorService;
        this.LJLILLLLZI = c65190PiE;
        this.LJLJJLL = scribeFilesSender;
        c65077PgP.getClass();
        this.LJLJJL = 600;
        LIZIZ(0L, this.LJLJJL);
    }
}
