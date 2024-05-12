package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.o;

/* renamed from: X.572, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass572 extends F9E {
    public final ResourceItem LJLIL;
    public AnonymousClass570 LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public AnonymousClass572(ResourceItem resourceItem, int i) {
        AnonymousClass570 downloadState;
        boolean z;
        if ((i & 2) != 0) {
            downloadState = AnonymousClass570.INIT;
        } else {
            downloadState = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(resourceItem, "resourceItem");
        o.LJIIIZ(downloadState, "downloadState");
        this.LJLIL = resourceItem;
        this.LJLILLLLZI = downloadState;
        this.LJLJI = false;
        this.LJLJJI = 0;
        this.LJLJJL = z;
    }
}
