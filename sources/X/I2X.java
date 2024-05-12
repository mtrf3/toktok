package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I2X implements InterfaceC144185lG {
    public final /* synthetic */ I2Z LJLIL;

    public I2X(I2Z i2z) {
        this.LJLIL = i2z;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        if ((i != 10001 && i != 10004) || intent == null || i2 != -1 || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(parcelableArrayListExtra, 10));
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            String str = mediaModel.fileLocalUriPath;
            o.LJIIIIZZ(str, "it.fileLocalUriPath");
            arrayList.add(new IB3(str, 0, mediaModel.duration, 60));
        }
        Iterator<I2Y> it2 = this.LJLIL.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ(((IB3) ORZ.LJLLJ(arrayList)).LJLILLLLZI);
        }
        return true;
    }
}
