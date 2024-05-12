package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.tools.draft.music.DraftOnlineMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.IDqS181S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169076kJ extends AbstractC168856jx {
    public final C169096kL LIZ;
    public final String LIZIZ = "DraftMusicRestoreHandler";
    public final int LIZJ = 1;
    public final int LIZLLL = 800;

    @Override // X.AbstractC168856jx
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC168706ji
    public final int LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC168706ji
    public final C169096kL getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC168706ji
    public final int getPriority() {
        return this.LIZLLL;
    }

    public C169076kJ(C169096kL c169096kL) {
        this.LIZ = c169096kL;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        AwemeDraft awemeDraft = (AwemeDraft) this.LIZ.LIZLLL;
        if (awemeDraft.LIZLLL == null) {
            return Boolean.TRUE;
        }
        if (awemeDraft.LJJJJI.recordMode == 1) {
            return Boolean.TRUE;
        }
        if (awemeDraft.LJJIL != null && awemeDraft.LJI != null) {
            File file = new File(((AwemeDraft) this.LIZ.LIZLLL).LJI);
            boolean exists = file.exists();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZIZ);
            LIZ.append(" duet music path = [");
            LIZ.append(((AwemeDraft) this.LIZ.LIZLLL).LJI);
            LIZ.append("], isMusicExist: ");
            LIZ.append(exists);
            C5Z2.LIZ(X1D.LIZIZ(LIZ));
            if ((exists && file.length() > 0) || C170626mo.LIZIZ(C60903NvH.LJ, UriProtector.parse(((AwemeDraft) this.LIZ.LIZLLL).LJI))) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // X.AbstractC168856jx
    public final Object LJFF(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        C1AU c1au;
        String str;
        InterfaceC169146kQ interfaceC169146kQ;
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(" ; restore start ...");
        C5Z2.LIZ(X1D.LIZIZ(LIZ));
        C169096kL c169096kL = this.LIZ;
        Context context = (Context) c169096kL.LIZ;
        String str2 = null;
        if (context instanceof ActivityC45651qj) {
            c1au = (C1AU) context;
        } else {
            c1au = null;
        }
        AwemeDraft draft = (AwemeDraft) c169096kL.LIZLLL;
        IDqS181S0200000_2 iDqS181S0200000_2 = new IDqS181S0200000_2(xks, this, 1);
        o.LJIIIZ(draft, "draft");
        AVMusic aVMusic = draft.LIZLLL;
        if (aVMusic != null && aVMusic.isLocalMusic()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("draft_music_process, to edit local music processor path - ");
            if (aVMusic != null) {
                str2 = aVMusic.path;
            }
            LIZ2.append(str2);
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            interfaceC169146kQ = new C168136in(draft, iDqS181S0200000_2);
        } else {
            if (C53235Kut.LIZ()) {
                if (aVMusic != null) {
                    str = aVMusic.path;
                } else {
                    str = null;
                }
                if (C169106kM.LIZ(str)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("draft_music_process, to edit stream music processor path - ");
                    if (aVMusic != null) {
                        str2 = aVMusic.path;
                    }
                    LIZ3.append(str2);
                    H7B.LIZ(X1D.LIZIZ(LIZ3));
                    DraftStreamMusicProcessor draftStreamMusicProcessor = new DraftStreamMusicProcessor(draft, iDqS181S0200000_2);
                    interfaceC169146kQ = draftStreamMusicProcessor;
                    if (c1au != null) {
                        Lifecycle lifecycle = c1au.getLifecycle();
                        interfaceC169146kQ = draftStreamMusicProcessor;
                        if (lifecycle != null) {
                            lifecycle.addObserver(draftStreamMusicProcessor);
                            interfaceC169146kQ = draftStreamMusicProcessor;
                        }
                    }
                }
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("draft_music_process, to edit online music processor path - ");
            if (aVMusic != null) {
                str2 = aVMusic.path;
            }
            LIZ4.append(str2);
            H7B.LIZ(X1D.LIZIZ(LIZ4));
            DraftOnlineMusicProcessor draftOnlineMusicProcessor = new DraftOnlineMusicProcessor(draft, iDqS181S0200000_2);
            interfaceC169146kQ = draftOnlineMusicProcessor;
            if (c1au != null) {
                Lifecycle lifecycle2 = c1au.getLifecycle();
                interfaceC169146kQ = draftOnlineMusicProcessor;
                if (lifecycle2 != null) {
                    lifecycle2.addObserver(draftOnlineMusicProcessor);
                    interfaceC169146kQ = draftOnlineMusicProcessor;
                }
            }
        }
        interfaceC169146kQ.LIZ();
        xks.LJIILIIL(new AqS168S0100000_2(this, 489));
        return xks.LJIIJJI();
    }
}
