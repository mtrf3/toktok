package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Hkf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44957Hkf extends AbstractC45395Hrj {
    public final Aweme LJFF;
    public final String LJI;
    public final String LJII;
    public final Bundle LJIIIIZZ;

    public abstract boolean LIZJ();

    public abstract boolean LIZLLL();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC44957Hkf(Context context, String downloadSuffix, int i, InterfaceC87766YcU interfaceC87766YcU, Aweme aweme, String enterFrom, String enterMethod, Bundle mobDownloadBundle) {
        super(context, downloadSuffix, i, interfaceC87766YcU);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(downloadSuffix, "downloadSuffix");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mobDownloadBundle, "mobDownloadBundle");
        this.LJFF = aweme;
        this.LJI = enterFrom;
        this.LJII = enterMethod;
        this.LJIIIIZZ = mobDownloadBundle;
    }
}
