package X;

import android.widget.ImageView;
import com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import kotlin.jvm.internal.AqS12S1101000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Xg2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85438Xg2 implements JC4 {
    public final /* synthetic */ DefaultMixListCell LJLIL;

    @Override // X.JC4
    public final void LJIILIIL(long j) {
    }

    @Override // X.JC4
    public final void onStart() {
    }

    @Override // X.JC4
    public final void LIZ() {
        T5T t5t = this.LJLIL.LJLIL;
        if (t5t != null) {
            if (o.LJ(t5t.getText().toString(), "")) {
                C116414hZ c116414hZ = this.LJLIL.LJLJJL;
                if (c116414hZ != null) {
                    c116414hZ.setVisibility(8);
                    ImageView imageView = this.LJLIL.LJLJJLL;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                        DefaultMixListCell defaultMixListCell = this.LJLIL;
                        C85431Xfv c85431Xfv = defaultMixListCell.LJLJLLL;
                        if (c85431Xfv != null) {
                            c85431Xfv.LJLJJL = false;
                            defaultMixListCell.N(false);
                            return;
                        } else {
                            o.LJIJI("defaultMixListItem");
                            throw null;
                        }
                    }
                    o.LJIJI("delete");
                    throw null;
                }
                o.LJIJI("loading");
                throw null;
            }
            T5T t5t2 = this.LJLIL.LJLIL;
            if (t5t2 != null) {
                if (s.LJZI(t5t2.getText().toString()).toString().length() == 0) {
                    this.LJLIL.M();
                    DefaultMixListCell defaultMixListCell2 = this.LJLIL;
                    C85431Xfv c85431Xfv2 = defaultMixListCell2.LJLJLLL;
                    if (c85431Xfv2 != null) {
                        c85431Xfv2.LJLJJL = false;
                        defaultMixListCell2.N(false);
                        return;
                    } else {
                        o.LJIJI("defaultMixListItem");
                        throw null;
                    }
                }
                T5T t5t3 = this.LJLIL.LJLIL;
                if (t5t3 != null) {
                    int length = t5t3.getText().toString().length();
                    DefaultMixListCell defaultMixListCell3 = this.LJLIL;
                    if (length > defaultMixListCell3.LJLLI) {
                        C85431Xfv c85431Xfv3 = defaultMixListCell3.LJLJLLL;
                        if (c85431Xfv3 != null) {
                            c85431Xfv3.LJLJJL = false;
                            defaultMixListCell3.N(false);
                            return;
                        } else {
                            o.LJIJI("defaultMixListItem");
                            throw null;
                        }
                    }
                    C116414hZ c116414hZ2 = defaultMixListCell3.LJLJJL;
                    if (c116414hZ2 != null) {
                        c116414hZ2.setVisibility(0);
                        ImageView imageView2 = this.LJLIL.LJLJJLL;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            EditPlayListNameEditTextVM editPlayListNameEditTextVM = (EditPlayListNameEditTextVM) this.LJLIL.LJLLILLLL.getValue();
                            T5T t5t4 = this.LJLIL.LJLIL;
                            if (t5t4 != null) {
                                String name = t5t4.getText().toString();
                                o.LJIIIZ(name, "name");
                                editPlayListNameEditTextVM.withState(new AqS12S1101000_3(editPlayListNameEditTextVM, name, 0));
                                return;
                            }
                            o.LJIJI("editText");
                            throw null;
                        }
                        o.LJIJI("delete");
                        throw null;
                    }
                    o.LJIJI("loading");
                    throw null;
                }
                o.LJIJI("editText");
                throw null;
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }

    public C85438Xg2(DefaultMixListCell defaultMixListCell) {
        this.LJLIL = defaultMixListCell;
    }
}
