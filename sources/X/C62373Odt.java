package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Odt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62373Odt {
    public String LIZ;
    public String LIZIZ;
    public ShareContentType[] LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public ShareModel LJI;
    public Bundle LJII = new Bundle();

    public C62373Odt LIZ(Parcel source) {
        ShareContentType[] shareContentTypeArr;
        o.LJIIIZ(source, "source");
        this.LIZ = source.readString();
        this.LIZIZ = source.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            shareContentTypeArr = (ShareContentType[]) source.readArray(ShareContentType.class.getClassLoader(), ShareContentType.class);
        } else {
            shareContentTypeArr = (ShareContentType[]) source.readArray(ShareContentType.class.getClassLoader());
        }
        this.LIZJ = shareContentTypeArr;
        this.LJI = (ShareModel) source.readParcelable(ShareModel.class.getClassLoader());
        this.LIZLLL = source.readString();
        this.LJ = source.readString();
        this.LJFF = source.readString();
        this.LJII.putAll(source.readBundle(getClass().getClassLoader()));
        return this;
    }
}
