package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEFileUtils;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import defpackage.b1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171566oK implements InterfaceC70422pa {
    public final XIA LJLIL = C78613UtF.LIZJ;
    public List<C171726oa> LJLILLLLZI;

    public C171566oK() {
        new ArrayList();
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public final void LIZ(int i, Context context, List list, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, final InterfaceC88472Yns onProgress) {
        String LJ;
        C145725nk L;
        C171726oa c171726oa = (C171726oa) ListProtector.get(list, i);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        int i2 = mediaUtil.LIZ(context, c171726oa.LIZ).LJLJJL;
        String workSpacePath = C152285yK.LIZ;
        StringBuilder LIZJ = b1.LIZJ(workSpacePath, "/reverse_");
        String str = c171726oa.LIZ;
        C152275yJ.LIZ.getClass();
        if (C152275yJ.LJI(str)) {
            LJ = C76857UEj.LIZLLL(context, UriProtector.parse(str));
        } else {
            LJ = C76857UEj.LJ(str);
        }
        LIZJ.append((Object) LJ);
        LIZJ.append(".mp4");
        final String LIZIZ = X1D.LIZIZ(LIZJ);
        if (C171596oN.LIZ.LIZJ(LIZIZ)) {
            c171726oa.LIZJ = true;
            c171726oa.LIZ = LIZIZ;
            interfaceC65784Pro.invoke();
            int i3 = i + 1;
            if (i3 < list.size()) {
                LIZ(i3, context, list, interfaceC65784Pro, interfaceC88472Yns, onProgress);
                return;
            } else {
                interfaceC88472Yns.invoke(Boolean.TRUE);
                return;
            }
        }
        String path = c171726oa.LIZ;
        final C171606oO c171606oO = new C171606oO(c171726oa, LIZIZ, interfaceC65784Pro, i, list, this, context, interfaceC88472Yns, onProgress);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(workSpacePath, "workSpacePath");
        o.LJIIIZ(onProgress, "onProgress");
        if (!C152275yJ.LJFF(context, path)) {
            c171606oO.invoke(-1);
            return;
        }
        String LJIILLIIL = o.LJIILLIIL("/audio/", workSpacePath);
        C152275yJ.LJII(LJIILLIIL, true);
        final String fileBestStreamAudio = VEUtils.getFileBestStreamAudio(path, o.LJIILLIIL("audio", LJIILLIIL));
        C145725nk LIZ = mediaUtil.LIZ(context, path);
        int i4 = LIZ.LJLJJI;
        if (i4 == 90 || i4 == 270) {
            L = C145725nk.L(LIZ, LIZ.LJLJI, LIZ.LJLILLLLZI);
        } else {
            L = C145725nk.L(LIZ, LIZ.LJLILLLLZI, LIZ.LJLJI);
        }
        final VEEditorResManager vEEditorResManager = new VEEditorResManager(workSpacePath);
        C87278YNe c87278YNe = new C87278YNe(2);
        c87278YNe.LJIIJ(L.LJLILLLLZI, L.LJLJI);
        c87278YNe.LJII(30);
        c87278YNe.LIZIZ.isSupportHWEncoder = false;
        c87278YNe.LJIIIIZZ(13);
        VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
        vEVideoEncodeSettings.gopSize = 1;
        vEVideoEncodeSettings.mWatermarkParam = null;
        c87278YNe.LJI(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
        c87278YNe.LJFF(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST);
        c87278YNe.LJ(false, false);
        VEEditor LJIJ = VEEditor.LJIJ(vEEditorResManager, new VETimelineParams(new String[]{path}), c87278YNe.LIZ(), 0, i2, new YOW() { // from class: X.5PI
            @Override // X.YOW
            public final void LIZ(int i5) {
                if (i5 == 0) {
                    if (fileBestStreamAudio != null) {
                        String LJIILLIIL2 = o.LJIILLIIL("/audio_reverse.mp4", new File(vEEditorResManager.mReverseAudioPaths[0]).getParent());
                        VEUtils.reverseAudio(fileBestStreamAudio, LJIILLIIL2);
                        VEUtils.mux(vEEditorResManager.mReverseVideoPath[0], LJIILLIIL2, LIZIZ);
                    } else {
                        new File(LIZIZ).createNewFile();
                        new File(vEEditorResManager.mReverseVideoPath[0]).renameTo(new File(LIZIZ));
                    }
                } else {
                    VEFileUtils.deleteFile(LIZIZ);
                }
                c171606oO.invoke(Integer.valueOf(i5));
            }

            @Override // X.YOW
            public final void LIZIZ(double d) {
                onProgress.invoke(Float.valueOf((float) d));
            }
        });
        C145765no.LIZ = LJIJ;
        if (LJIJ != null) {
            return;
        }
        c171606oO.invoke(-1);
    }
}
