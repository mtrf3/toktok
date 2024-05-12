package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.mt.protector.impl.UriProtector;
import java.security.InvalidParameterException;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134305Ow {
    public static InterfaceC88472Yns<? super String, String> LIZ;

    public static final String LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            throw new InvalidParameterException("genMusicUrs but musicId is empty");
        }
        String NLEResourceIdConverter_convertMusicIdResource = NLEEditorJniJNI.NLEResourceIdConverter_convertMusicIdResource(str);
        o.LJIIIIZZ(NLEResourceIdConverter_convertMusicIdResource, "NLEResourceIdConverter.c…tMusicIdResource(musicId)");
        return NLEResourceIdConverter_convertMusicIdResource;
    }

    public static final OSZ<String, String> LIZJ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            android.net.Uri uri = UriProtector.parse(str);
            o.LJIIIIZZ(uri, "uri");
            if (!o.LJ(uri.getHost(), "effect_platform")) {
                return null;
            }
            return new OSZ<>(UriProtector.getQueryParameter(uri, "panel"), UriProtector.getQueryParameter(uri, "resource_id"));
        } catch (Exception e) {
            C82891Wg3.LIZLLL().LIZIZ(e);
            return null;
        }
    }

    public static final String LIZLLL(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            android.net.Uri uri = UriProtector.parse(str);
            o.LJIIIIZZ(uri, "uri");
            if (o.LJ(uri.getHost(), "music_resource")) {
                return UriProtector.getQueryParameter(uri, "clip_id");
            }
        } catch (Exception e) {
            C82891Wg3.LIZLLL().LIZIZ(e);
        }
        return null;
    }

    public static final String LIZ(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            C82891Wg3.LIZLLL().LIZ("genUrs but resId or panel is empty");
            return "";
        }
        String NLEResourceIdConverter_convertLokiResourceWithResourceId = NLEEditorJniJNI.NLEResourceIdConverter_convertLokiResourceWithResourceId(str, str2);
        o.LJIIIIZZ(NLEResourceIdConverter_convertLokiResourceWithResourceId, "NLEResourceIdConverter.c…hResourceId(resId, panel)");
        return NLEResourceIdConverter_convertLokiResourceWithResourceId;
    }
}
