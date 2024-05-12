package X;

import android.os.Parcel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.17q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C279017q implements InterfaceC48038ItG {
    public static void LIZLLL(C62905OmT c62905OmT) {
        new C62906OmU(c62905OmT).LIZLLL();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static C145995oB LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        o.LJIIIZ(videoPublishEditModel, str);
        return new C145995oB();
    }

    public static Iterator LIZIZ(Parcel parcel, int i, List list) {
        parcel.writeInt(i);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void LJ(String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        C0NB.LIZIZ(str3, X1D.LIZIZ(LIZ));
    }

    public static void LIZJ(int i, String str, boolean z, boolean z2, Keva keva, String str2) {
        keva.storeBoolean(str2, FFL.LJ(i, str, z, z2));
        FFL.LJIIIZ().getClass();
    }
}
