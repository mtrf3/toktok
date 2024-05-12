package com.ss.android.ugc.aweme.ecommerce.gallery;

import X.C16880lQ;
import X.C61878OQg;
import X.C70388Rjs;
import X.C79004UzY;
import X.C81947WEd;
import X.C81949WEf;
import X.C81951WEh;
import X.C81952WEi;
import X.C81954WEk;
import X.C81955WEl;
import X.DialogInterfaceC39771hF;
import X.DialogInterfaceOnShowListenerC81948WEe;
import X.InterfaceC65349Pkn;
import android.content.Context;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class GalleryUtil {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes13.dex */
    public static final class ImageInfo {

        @InterfaceC65349Pkn("title")
        public final String title;

        @InterfaceC65349Pkn("url_list")
        public final List<String> urlList;

        public ImageInfo() {
            this(null, null, 3, null);
        }

        public ImageInfo(String str, List<String> urlList) {
            o.LJIIIZ(urlList, "urlList");
            this.title = str;
            this.urlList = urlList;
        }

        public ImageInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
        }
    }

    public static void LIZ(Context context, int i, int i2, List sourceImageList, String identity, String from, List list, C70388Rjs c70388Rjs, C81954WEk c81954WEk, int i3) {
        C70388Rjs c70388Rjs2 = c70388Rjs;
        C81954WEk c81954WEk2 = c81954WEk;
        if ((i3 & 16) != 0) {
            identity = "";
        }
        if ((i3 & 32) != 0) {
            from = "";
        }
        if ((i3 & 128) != 0) {
            list = null;
        }
        if ((i3 & 1024) != 0) {
            c70388Rjs2 = null;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            c81954WEk2 = new C81954WEk();
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sourceImageList, "sourceImageList");
        o.LJIIIZ(identity, "identity");
        o.LJIIIZ(from, "from");
        C81952WEi c81952WEi = new C81952WEi();
        c81952WEi.LIZLLL = sourceImageList;
        c81952WEi.LIZJ = sourceImageList;
        c81952WEi.LJ = list;
        c81952WEi.LJFF = c81954WEk2;
        c81952WEi.LJI = new C81951WEh();
        c81952WEi.LJIIIIZZ = true;
        c81952WEi.LJIIJ = null;
        c81952WEi.LJII = null;
        int i4 = 0;
        c81952WEi.LJIIIZ = false;
        c81952WEi.LJIIJJI = c70388Rjs2;
        c81952WEi.LIZ = identity;
        c81952WEi.LIZIZ = from;
        C81949WEf c81949WEf = new C81949WEf();
        c81949WEf.LIZ = 0;
        c81949WEf.LIZIZ = R.drawable.adq;
        c81949WEf.LIZJ = -16777216;
        c81949WEf.LIZLLL = 0L;
        c81949WEf.LJ = true;
        List<String> list2 = c81952WEi.LIZJ;
        if (list2 != null && !C79004UzY.LJJIFFI(list2)) {
            c81949WEf.LJIJJ = c81952WEi.LIZJ.size();
            c81949WEf.LJIIIZ = c81952WEi.LIZJ;
            c81949WEf.LJIIJ = c81952WEi.LIZLLL;
            c81949WEf.LJIIJJI = c81952WEi.LJ;
        }
        c81949WEf.LJIIL = c81952WEi.LJFF;
        c81949WEf.LJIILIIL = c81952WEi.LJI;
        c81949WEf.LJIILLIIL = c81952WEi.LJIIIIZZ;
        c81949WEf.LJIIZILJ = c81952WEi.LJIIIZ;
        c81949WEf.LJIJI = c81952WEi.LJIIJ;
        c81949WEf.LJIILJJIL = c81952WEi.LJII;
        c81949WEf.LJIJ = c81952WEi.LJIIJJI;
        c81949WEf.LJII = c81952WEi.LIZIZ;
        c81949WEf.LJI = c81952WEi.LIZ;
        DialogInterfaceOnShowListenerC81948WEe dialogInterfaceOnShowListenerC81948WEe = new DialogInterfaceOnShowListenerC81948WEe(context);
        if (i >= i2) {
            c81949WEf.LIZ = i2 - 1;
        } else if (i < 0) {
            c81949WEf.LIZ = 0;
        } else {
            c81949WEf.LIZ = i;
        }
        c81949WEf.LJFF = i2;
        if (!dialogInterfaceOnShowListenerC81948WEe.LJLJJI) {
            dialogInterfaceOnShowListenerC81948WEe.LJLJI = c81949WEf;
            ArrayList arrayList = new ArrayList();
            C81949WEf c81949WEf2 = dialogInterfaceOnShowListenerC81948WEe.LJLJI;
            if (c81949WEf2 != null) {
                int size = c81949WEf2.LJIIIZ.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(null);
                }
            }
            C81949WEf c81949WEf3 = dialogInterfaceOnShowListenerC81948WEe.LJLJI;
            if (c81949WEf3 != null) {
                c81949WEf3.LJIIIIZZ = arrayList;
            }
            List<String> list3 = c81949WEf3.LJIIIZ;
            if (list3 == null || list3.isEmpty()) {
                throw new IllegalArgumentException("the parameter sourceImageList can't be empty");
            }
            C81949WEf c81949WEf4 = dialogInterfaceOnShowListenerC81948WEe.LJLJI;
            int i6 = c81949WEf4.LIZ;
            if (i6 >= 0) {
                i4 = i6;
            }
            c81949WEf4.LIZ = i4;
            long j = c81949WEf4.LIZLLL;
            if (j <= 0) {
                j = 300;
            }
            c81949WEf4.LIZLLL = j;
            C81951WEh c81951WEh = c81949WEf4.LJIILIIL;
            if (c81951WEh == null) {
                c81951WEh = new C81951WEh();
            }
            c81949WEf4.LJIILIIL = c81951WEh;
            C81947WEd c81947WEd = dialogInterfaceOnShowListenerC81948WEe.LJLILLLLZI;
            if (c81947WEd != null) {
                c81947WEd.LJLJJI = c81949WEf;
                c81947WEd.LJLJJL = new C81955WEl(c81947WEd);
            }
        }
        if (dialogInterfaceOnShowListenerC81948WEe.LJLJJI) {
            return;
        }
        DialogInterfaceC39771hF dialogInterfaceC39771hF = dialogInterfaceOnShowListenerC81948WEe.LJLIL;
        if (dialogInterfaceC39771hF != null) {
            C16880lQ.LIZ(dialogInterfaceC39771hF);
        }
        dialogInterfaceOnShowListenerC81948WEe.LJLJJI = true;
    }
}
