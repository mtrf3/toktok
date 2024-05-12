package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.1B3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1B3 extends AbstractC025808g implements C08Y, InterfaceC025308b {
    public final FragmentManager LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;

    @Override // X.AbstractC025808g
    public final int LJI() {
        return LJIILL(true);
    }

    public final int LJIILJJIL() {
        return LJIILL(false);
    }

    @Override // X.AbstractC025808g
    public final void LJII() {
        if (!this.LJI) {
            this.LJII = false;
            this.LJIILLIIL.LJJIJL(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void LJIILLIIL() {
        if (!this.LJI) {
            this.LJII = false;
            this.LJIILLIIL.LJJIJL(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void LJIJI() {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            C025708f c025708f = (C025708f) ListProtector.get(this.LIZ, i);
            Fragment fragment = c025708f.LIZIZ;
            if (fragment != null) {
                fragment.setNextTransition(this.LJFF);
            }
            switch (c025708f.LIZ) {
                case 1:
                    fragment.setNextAnim(c025708f.LIZJ);
                    this.LJIILLIIL.LJLIIL(fragment, false);
                    this.LJIILLIIL.LIZLLL(fragment);
                    break;
                case 2:
                default:
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unknown cmd: ");
                    LIZ.append(c025708f.LIZ);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                case 3:
                    fragment.setNextAnim(c025708f.LIZLLL);
                    this.LJIILLIIL.LJJLJLI(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(c025708f.LIZLLL);
                    FragmentManager fragmentManager = this.LJIILLIIL;
                    fragmentManager.getClass();
                    if (!fragment.mHidden) {
                        fragment.mHidden = true;
                        fragment.mHiddenChanged = !fragment.mHiddenChanged;
                        fragmentManager.LJLJI(fragment);
                        break;
                    }
                    break;
                case 5:
                    fragment.setNextAnim(c025708f.LIZJ);
                    this.LJIILLIIL.LJLIIL(fragment, false);
                    this.LJIILLIIL.getClass();
                    if (fragment.mHidden) {
                        fragment.mHidden = false;
                        fragment.mHiddenChanged = !fragment.mHiddenChanged;
                        break;
                    }
                    break;
                case 6:
                    fragment.setNextAnim(c025708f.LIZLLL);
                    this.LJIILLIIL.LJIILIIL(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(c025708f.LIZJ);
                    this.LJIILLIIL.LJLIIL(fragment, false);
                    this.LJIILLIIL.LJIIIIZZ(fragment);
                    break;
                case 8:
                    this.LJIILLIIL.LJLILLLLZI(fragment);
                    break;
                case 9:
                    this.LJIILLIIL.LJLILLLLZI(null);
                    break;
                case 10:
                    this.LJIILLIIL.LJLIL(fragment, c025708f.LJII);
                    break;
            }
            if (!this.LJIILL && c025708f.LIZ != 1 && fragment != null) {
                this.LJIILLIIL.LJJL(fragment);
            }
        }
        if (!this.LJIILL) {
            FragmentManager fragmentManager2 = this.LJIILLIIL;
            fragmentManager2.LJJLIIIIJ(fragmentManager2.mCurState, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.LJIJ >= 0) {
            sb.append(" #");
            sb.append(this.LJIJ);
        }
        if (this.LJIIIIZZ != null) {
            sb.append(" ");
            sb.append(this.LJIIIIZZ);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // X.C08Y
    public final int getId() {
        return this.LJIJ;
    }

    @Override // X.C08Y
    public final String getName() {
        return this.LJIIIIZZ;
    }

    public C1B3(FragmentManager fragmentManager) {
        fragmentManager.LJJJJL();
        C1BB<?> c1bb = fragmentManager.mHost;
        if (c1bb != null) {
            c1bb.LJLILLLLZI.getClassLoader();
        }
        this.LJIJ = -1;
        this.LJIILLIIL = fragmentManager;
    }

    public static boolean LJJ(C025708f c025708f) {
        Fragment fragment = c025708f.LIZIZ;
        if (fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC025808g
    public final C1B3 LJIIIZ(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.LJIILLIIL) {
            LIZJ(new C025708f(4, fragment));
            return this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        LIZ.append(fragment.toString());
        LIZ.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC025808g
    public final C1B3 LJIIL(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.LJIILLIIL) {
            LIZJ(new C025708f(5, fragment));
            return this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        LIZ.append(fragment.toString());
        LIZ.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LJIILIIL(int i) {
        if (!this.LJI) {
            return;
        }
        int size = this.LIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C025708f) ListProtector.get(this.LIZ, i2)).LIZIZ;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
            }
        }
    }

    public final int LJIILL(boolean z) {
        if (!this.LJIIZILJ) {
            if (FragmentManager.LJJJJZI()) {
                PrintWriter printWriter = new PrintWriter(new C15050iT());
                LJIJ("  ", printWriter, true);
                printWriter.close();
            }
            this.LJIIZILJ = true;
            if (this.LJI) {
                this.LJIJ = this.LJIILLIIL.LJI();
            } else {
                this.LJIJ = -1;
            }
            this.LJIILLIIL.LJJIJIIJI(this, z);
            return this.LJIJ;
        }
        throw new IllegalStateException("commit already called");
    }

    public final C1B3 LJIIZILJ(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.LJIILLIIL) {
            LIZJ(new C025708f(6, fragment));
            return this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        LIZ.append(fragment.toString());
        LIZ.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LJIJJ(boolean z) {
        for (int size = this.LIZ.size() - 1; size >= 0; size--) {
            C025708f c025708f = (C025708f) ListProtector.get(this.LIZ, size);
            Fragment fragment = c025708f.LIZIZ;
            if (fragment != null) {
                int i = this.LJFF;
                int i2 = 8194;
                if (i != 4097) {
                    if (i != 4099) {
                        if (i != 8194) {
                            i2 = 0;
                        } else {
                            i2 = 4097;
                        }
                    } else {
                        i2 = 4099;
                    }
                }
                fragment.setNextTransition(i2);
            }
            switch (c025708f.LIZ) {
                case 1:
                    fragment.setNextAnim(c025708f.LJFF);
                    this.LJIILLIIL.LJLIIL(fragment, true);
                    this.LJIILLIIL.LJJLJLI(fragment);
                    break;
                case 2:
                default:
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unknown cmd: ");
                    LIZ.append(c025708f.LIZ);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                case 3:
                    fragment.setNextAnim(c025708f.LJ);
                    this.LJIILLIIL.LIZLLL(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(c025708f.LJ);
                    this.LJIILLIIL.getClass();
                    if (fragment.mHidden) {
                        fragment.mHidden = false;
                        fragment.mHiddenChanged = !fragment.mHiddenChanged;
                        break;
                    }
                    break;
                case 5:
                    fragment.setNextAnim(c025708f.LJFF);
                    this.LJIILLIIL.LJLIIL(fragment, true);
                    FragmentManager fragmentManager = this.LJIILLIIL;
                    fragmentManager.getClass();
                    if (!fragment.mHidden) {
                        fragment.mHidden = true;
                        fragment.mHiddenChanged = !fragment.mHiddenChanged;
                        fragmentManager.LJLJI(fragment);
                        break;
                    }
                    break;
                case 6:
                    fragment.setNextAnim(c025708f.LJ);
                    this.LJIILLIIL.LJIIIIZZ(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(c025708f.LJFF);
                    this.LJIILLIIL.LJLIIL(fragment, true);
                    this.LJIILLIIL.LJIILIIL(fragment);
                    break;
                case 8:
                    this.LJIILLIIL.LJLILLLLZI(null);
                    break;
                case 9:
                    this.LJIILLIIL.LJLILLLLZI(fragment);
                    break;
                case 10:
                    this.LJIILLIIL.LJLIL(fragment, c025708f.LJI);
                    break;
            }
            if (!this.LJIILL && c025708f.LIZ != 3 && fragment != null) {
                this.LJIILLIIL.LJJL(fragment);
            }
        }
        if (!this.LJIILL && z) {
            FragmentManager fragmentManager2 = this.LJIILLIIL;
            fragmentManager2.LJJLIIIIJ(fragmentManager2.mCurState, true);
        }
    }

    public final boolean LJIJJLI(int i) {
        int i2;
        int size = this.LIZ.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = ((C025708f) ListProtector.get(this.LIZ, i3)).LIZIZ;
            if (fragment != null && (i2 = fragment.mContainerId) != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final C1B3 LJJI(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.LJIILLIIL) {
            LIZJ(new C025708f(3, fragment));
            return this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        LIZ.append(fragment.toString());
        LIZ.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC025308b
    public final boolean LIZ(ArrayList<C1B3> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.LJI) {
            FragmentManager fragmentManager = this.LJIILLIIL;
            if (fragmentManager.mBackStack == null) {
                fragmentManager.mBackStack = new ArrayList<>();
            }
            fragmentManager.mBackStack.add(this);
            return true;
        }
        return true;
    }

    public final C1B3 LJJIFFI(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager == this.LJIILLIIL) {
            Lifecycle.State state2 = Lifecycle.State.CREATED;
            if (state.isAtLeast(state2)) {
                LIZJ(new C025708f(fragment, state));
                return this;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot set maximum Lifecycle below ");
            LIZ.append(state2);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        LIZ2.append(this.LJIILLIIL);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public final void LJIJ(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.LJIIIIZZ);
            printWriter.print(" mIndex=");
            printWriter.print(this.LJIJ);
            printWriter.print(" mCommitted=");
            printWriter.println(this.LJIIZILJ);
            if (this.LJFF != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.LJFF));
            }
            if (this.LIZIZ != 0 || this.LIZJ != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.LIZIZ));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.LIZJ));
            }
            if (this.LIZLLL != 0 || this.LJ != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.LIZLLL));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.LJ));
            }
            if (this.LJIIIZ != 0 || this.LJIIJ != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.LJIIIZ));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.LJIIJ);
            }
            if (this.LJIIJJI != 0 || this.LJIIL != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.LJIIJJI));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.LJIIL);
            }
        }
        if (!this.LIZ.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.LIZ.size();
            for (int i = 0; i < size; i++) {
                C025708f c025708f = (C025708f) ListProtector.get(this.LIZ, i);
                switch (c025708f.LIZ) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("cmd=");
                        LIZ.append(c025708f.LIZ);
                        str2 = X1D.LIZIZ(LIZ);
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c025708f.LIZIZ);
                if (z) {
                    if (c025708f.LIZJ != 0 || c025708f.LIZLLL != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c025708f.LIZJ));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c025708f.LIZLLL));
                    }
                    if (c025708f.LJ != 0 || c025708f.LJFF != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c025708f.LJ));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c025708f.LJFF));
                    }
                }
            }
        }
    }

    public final boolean LJIL(ArrayList<C1B3> arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.LIZ.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = ((C025708f) ListProtector.get(this.LIZ, i5)).LIZIZ;
            if (fragment != null && (i3 = fragment.mContainerId) != 0 && i3 != i4) {
                for (int i6 = i; i6 < i2; i6++) {
                    AbstractC025808g abstractC025808g = (AbstractC025808g) ListProtector.get(arrayList, i6);
                    int size2 = abstractC025808g.LIZ.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C025708f) ListProtector.get(abstractC025808g.LIZ, i7)).LIZIZ;
                        if (fragment2 != null && fragment2.mContainerId == i3) {
                            return true;
                        }
                    }
                }
                i4 = i3;
            }
        }
        return false;
    }

    @Override // X.AbstractC025808g
    public final void LJIIIIZZ(int i, int i2, Fragment fragment, String str) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 == null || str.equals(str2)) {
                    fragment.mTag = str;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Can't change tag of fragment ");
                    LIZ.append(fragment);
                    LIZ.append(": was ");
                    throw new IllegalStateException(C025908h.LIZIZ(LIZ, fragment.mTag, " now ", str, LIZ));
                }
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 == 0 || i3 == i) {
                        fragment.mFragmentId = i;
                        fragment.mContainerId = i;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Can't change container ID of fragment ");
                        LIZ2.append(fragment);
                        LIZ2.append(": was ");
                        LIZ2.append(fragment.mFragmentId);
                        LIZ2.append(" now ");
                        LIZ2.append(i);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Can't add fragment ");
                    LIZ3.append(fragment);
                    LIZ3.append(" with tag ");
                    LIZ3.append(str);
                    LIZ3.append(" to container view with no id");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
                }
            }
            LIZJ(new C025708f(i2, fragment));
            fragment.mFragmentManager = this.LJIILLIIL;
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Fragment ");
        LIZ4.append(C16880lQ.LJLLILLLL(cls));
        LIZ4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ4));
    }
}
