package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;

/* renamed from: X.Cbo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31668Cbo<T> implements InterfaceC64592gB {
    public final /* synthetic */ File LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ImageModel LJLJI;
    public final /* synthetic */ Boolean LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC31664Cbk LJLJL;

    public C31668Cbo(ImageModel imageModel, InterfaceC31664Cbk interfaceC31664Cbk, File file, Boolean bool, Integer num, String str, String str2) {
        this.LJLIL = file;
        this.LJLILLLLZI = str;
        this.LJLJI = imageModel;
        this.LJLJJI = bool;
        this.LJLJJL = num;
        this.LJLJJLL = str2;
        this.LJLJL = interfaceC31664Cbk;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            File file = this.LJLIL;
            String str = this.LJLILLLLZI;
            if (file != null) {
                File file2 = new File(file, i0.LJFF(str, ".png"));
                BitmapUtils.saveBitmapToSD(bitmap, file2.getParent(), file2.getName());
            }
            String str2 = (String) ListProtector.get(this.LJLJI.getUrls(), 0);
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.LJLJJI;
            C28274B7u.LIZ(str2, this.LJLJJLL, bool, this.LJLJJL, bool2, "success");
            InterfaceC31664Cbk interfaceC31664Cbk = this.LJLJL;
            if (interfaceC31664Cbk != null) {
                interfaceC31664Cbk.LIZIZ(bitmap);
                return;
            }
            return;
        }
        String str3 = (String) ListProtector.get(this.LJLJI.getUrls(), 0);
        Boolean bool3 = Boolean.FALSE;
        Boolean bool4 = this.LJLJJI;
        C28274B7u.LIZ(str3, this.LJLJJLL, bool3, this.LJLJJL, bool4, "bitmap is null");
        InterfaceC31664Cbk interfaceC31664Cbk2 = this.LJLJL;
        if (interfaceC31664Cbk2 == null) {
            return;
        }
        new IllegalStateException();
        interfaceC31664Cbk2.onFail();
    }
}
