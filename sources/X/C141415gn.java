package X;

import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.5gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C141415gn {
    public static Bundle LIZ(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static Iterator LIZJ(NLEEditor nLEEditor, String str) {
        VecNLETrackSPtr tracks = nLEEditor.LJ().getTracks();
        o.LJIIIIZZ(tracks, str);
        return tracks.iterator();
    }

    public static String LIZIZ(Locale locale, String str, String str2, Locale locale2, String str3) {
        o.LJIIIIZZ(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        o.LJIIIIZZ(lowerCase, str3);
        return lowerCase;
    }
}
