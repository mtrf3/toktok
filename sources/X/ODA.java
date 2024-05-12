package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import defpackage.i0;
import java.io.File;

/* loaded from: classes11.dex */
public final class ODA extends AbstractC61551ODr<Pair<android.net.Uri, UpdatePackage>, Pair<OEF, UpdatePackage>> {
    public static final String LJIIIZ;
    public C61276O3c LJI;
    public AbstractC61537ODd LJII;
    public OptionCheckUpdateParams LJIIIIZZ;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res");
        LIZ.append(File.separator);
        LJIIIZ = X1D.LIZIZ(LIZ);
    }

    public static File LIZLLL(UpdatePackage updatePackage) {
        String accessKey = updatePackage.getAccessKey();
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        File rootDirectory = c61532OCy.LJ.getRootDirectory();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(accessKey);
        String str = File.separator;
        LIZ.append(str);
        LIZ.append(updatePackage.getChannel());
        LIZ.append(str);
        LIZ.append(updatePackage.getVersion());
        LIZ.append("--updating");
        return new File(rootDirectory, X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        this.LJI = (C61276O3c) objArr[0];
        this.LJII = (AbstractC61537ODd) objArr[1];
        if (objArr.length > 2) {
            Object obj = objArr[2];
            if (obj instanceof OptionCheckUpdateParams) {
                this.LJIIIIZZ = (OptionCheckUpdateParams) obj;
            }
        }
    }

    public static String LIZJ(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring)) {
                    StringBuilder LIZ = X1D.LIZ();
                    return JBR.LJFF(LIZ, LJIIIZ, substring, LIZ);
                }
                throw new RuntimeException(i0.LJFF("url path illegal, url:", str));
            }
            throw new RuntimeException(i0.LJFF("url path illegal, url:", str));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("url empty, channel:");
        LIZ2.append(updatePackage.getChannel());
        throw new RuntimeException(X1D.LIZIZ(LIZ2));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    @Override // X.AbstractC61551ODr
    public final java.lang.Object LIZIZ(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static boolean LJ(File file, String str, File file2, C61538ODe c61538ODe, boolean z) {
        long j = c61538ODe.LJLJJL;
        int i = C61571OEl.LIZ.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try recordBreakPoint, position:");
        LIZ.append(j);
        LIZ.append(", threshold:");
        LIZ.append(i);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        if (j <= i) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("--BP");
        LIZ2.append(j);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (z && file2.getName().equals(LIZIZ)) {
            return true;
        }
        boolean renameTo = file2.renameTo(new File(file, LIZIZ));
        if (!renameTo) {
            OC6.LIZ("gecko-debug-tag", "rename file failed");
        }
        return renameTo;
    }
}
