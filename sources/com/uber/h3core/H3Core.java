package com.uber.h3core;

import X.C16880lQ;
import X.C91038ZoA;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.uber.h3core.H3Core;
import com.uber.h3core.H3CoreLoader;
import com.uber.h3core.exceptions.DistanceUndefinedException;
import com.uber.h3core.exceptions.LineUndefinedException;
import com.uber.h3core.exceptions.LocalIjUndefinedException;
import com.uber.h3core.exceptions.PentagonEncounteredException;
import com.uber.h3core.util.CoordIJ;
import com.uber.h3core.util.GeoCoord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* loaded from: classes24.dex */
public class H3Core {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final NativeMethods h3Api;

    public static /* synthetic */ boolean lambda$h3GetFaces$0(int i) {
        return i != -1;
    }

    public int h3GetResolution(long j) {
        return (int) ((j & 67553994410557440L) >> 52);
    }

    public Collection<Long> getRes0Indexes() {
        long[] jArr = new long[122];
        this.h3Api.getRes0Indexes(jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public static H3Core newInstance() {
        return new H3Core(H3CoreLoader.loadNatives());
    }

    public static H3Core newSystemInstance() {
        return new H3Core(H3CoreLoader.loadSystemNatives());
    }

    public Collection<String> getRes0IndexesAddresses() {
        return h3ToStringList(getRes0Indexes());
    }

    public H3Core(NativeMethods nativeMethods) {
        this.h3Api = nativeMethods;
    }

    public static void checkResolution(int i) {
        if (i >= 0 && i <= 15) {
        } else {
            throw new IllegalArgumentException(C16880lQ.LLLZ("resolution %d is out of range (must be 0 <= res <= 15)", new Object[]{Integer.valueOf(i)}));
        }
    }

    public static long[] collectionToLongArray(Collection<Long> collection) {
        return collection.stream().mapToLong(new ToLongFunction() { // from class: X.Zo7
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long longValue;
                longValue = ((Long) obj).longValue();
                return longValue;
            }
        }).toArray();
    }

    public List<String> h3ToStringList(Collection<Long> collection) {
        return (List) collection.stream().map(new Function() { // from class: X.ZoB
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String h3ToString;
                h3ToString = H3Core.this.h3ToString(((Long) obj).longValue());
                return h3ToString;
            }
        }).collect(Collectors.toList());
    }

    public static List<Long> nonZeroLongArrayToList(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            if (j != 0) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    private List<Long> stringToH3List(Collection<String> collection) {
        return (List) collection.stream().map(new Function() { // from class: X.Zo9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                long stringToH3;
                stringToH3 = H3Core.this.stringToH3((String) obj);
                return Long.valueOf(stringToH3);
            }
        }).collect(Collectors.toList());
    }

    public List<Long> compact(Collection<Long> collection) {
        int size = collection.size();
        long[] jArr = new long[size];
        if (this.h3Api.compact(collectionToLongArray(collection), jArr) == 0) {
            return nonZeroLongArrayToList(jArr);
        }
        throw new IllegalArgumentException("Bad input to compact");
    }

    public List<String> compactAddress(Collection<String> collection) {
        return h3ToStringList(compact(stringToH3List(collection)));
    }

    public String getDestinationH3IndexFromUnidirectionalEdge(String str) {
        return h3ToString(getDestinationH3IndexFromUnidirectionalEdge(stringToH3(str)));
    }

    public List<Long> getH3IndexesFromUnidirectionalEdge(long j) {
        long[] jArr = new long[2];
        this.h3Api.getH3IndexesFromUnidirectionalEdge(j, jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public List<GeoCoord> getH3UnidirectionalEdgeBoundary(long j) {
        double[] dArr = new double[20];
        int h3UnidirectionalEdgeBoundary = this.h3Api.getH3UnidirectionalEdgeBoundary(j, dArr);
        ArrayList arrayList = new ArrayList(h3UnidirectionalEdgeBoundary);
        for (int i = 0; i < h3UnidirectionalEdgeBoundary; i++) {
            int i2 = i * 2;
            arrayList.add(new GeoCoord(Math.toDegrees(dArr[i2]), Math.toDegrees(dArr[i2 + 1])));
        }
        return arrayList;
    }

    public List<Long> getH3UnidirectionalEdgesFromHexagon(long j) {
        long[] jArr = new long[6];
        this.h3Api.getH3UnidirectionalEdgesFromHexagon(j, jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public String getOriginH3IndexFromUnidirectionalEdge(String str) {
        return h3ToString(getOriginH3IndexFromUnidirectionalEdge(stringToH3(str)));
    }

    public Collection<Long> getPentagonIndexes(int i) {
        checkResolution(i);
        long[] jArr = new long[12];
        this.h3Api.getPentagonIndexes(i, jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public Collection<String> getPentagonIndexesAddresses(int i) {
        return h3ToStringList(getPentagonIndexes(i));
    }

    public int h3GetBaseCell(String str) {
        return h3GetBaseCell(stringToH3(str));
    }

    public Collection<Integer> h3GetFaces(long j) {
        int[] iArr = new int[this.h3Api.maxFaceCount(j)];
        this.h3Api.h3GetFaces(j, iArr);
        return (Collection) IntStream.of(iArr).filter(new IntPredicate() { // from class: X.Zo8
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return H3Core.lambda$h3GetFaces$0(i);
            }
        }).boxed().collect(Collectors.toList());
    }

    public int h3GetResolution(String str) {
        return h3GetResolution(stringToH3(str));
    }

    public boolean h3IsPentagon(String str) {
        return h3IsPentagon(stringToH3(str));
    }

    public boolean h3IsResClassIII(long j) {
        if (h3GetResolution(j) % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean h3IsValid(String str) {
        return h3IsValid(stringToH3(str));
    }

    public GeoCoord h3ToGeo(long j) {
        double[] dArr = new double[2];
        this.h3Api.h3ToGeo(j, dArr);
        return new GeoCoord(Math.toDegrees(dArr[0]), Math.toDegrees(dArr[1]));
    }

    public List<GeoCoord> h3ToGeoBoundary(long j) {
        double[] dArr = new double[20];
        int h3ToGeoBoundary = this.h3Api.h3ToGeoBoundary(j, dArr);
        ArrayList arrayList = new ArrayList(h3ToGeoBoundary);
        for (int i = 0; i < h3ToGeoBoundary; i++) {
            int i2 = i * 2;
            arrayList.add(new GeoCoord(Math.toDegrees(dArr[i2]), Math.toDegrees(dArr[i2 + 1])));
        }
        return arrayList;
    }

    public String h3ToString(long j) {
        return Long.toHexString(j);
    }

    public boolean h3UnidirectionalEdgeIsValid(String str) {
        return h3UnidirectionalEdgeIsValid(stringToH3(str));
    }

    public long numHexagons(int i) {
        checkResolution(i);
        return this.h3Api.numHexagons(i);
    }

    public long stringToH3(String str) {
        return CastLongProtector.parseUnsignedLong(str, 16);
    }

    public long getDestinationH3IndexFromUnidirectionalEdge(long j) {
        return this.h3Api.getDestinationH3IndexFromUnidirectionalEdge(j);
    }

    public List<String> getH3IndexesFromUnidirectionalEdge(String str) {
        return h3ToStringList(getH3IndexesFromUnidirectionalEdge(stringToH3(str)));
    }

    public List<GeoCoord> getH3UnidirectionalEdgeBoundary(String str) {
        return getH3UnidirectionalEdgeBoundary(stringToH3(str));
    }

    public List<String> getH3UnidirectionalEdgesFromHexagon(String str) {
        return h3ToStringList(getH3UnidirectionalEdgesFromHexagon(stringToH3(str)));
    }

    public long getOriginH3IndexFromUnidirectionalEdge(long j) {
        return this.h3Api.getOriginH3IndexFromUnidirectionalEdge(j);
    }

    public int h3GetBaseCell(long j) {
        return this.h3Api.h3GetBaseCell(j);
    }

    public Collection<Integer> h3GetFaces(String str) {
        return h3GetFaces(stringToH3(str));
    }

    public boolean h3IsPentagon(long j) {
        return this.h3Api.h3IsPentagon(j);
    }

    public boolean h3IsResClassIII(String str) {
        return h3IsResClassIII(stringToH3(str));
    }

    public boolean h3IsValid(long j) {
        return this.h3Api.h3IsValid(j);
    }

    public GeoCoord h3ToGeo(String str) {
        return h3ToGeo(stringToH3(str));
    }

    public List<GeoCoord> h3ToGeoBoundary(String str) {
        return h3ToGeoBoundary(stringToH3(str));
    }

    public boolean h3UnidirectionalEdgeIsValid(long j) {
        return this.h3Api.h3UnidirectionalEdgeIsValid(j);
    }

    public static H3Core newInstance(H3CoreLoader.OperatingSystem operatingSystem, String str) {
        return new H3Core(H3CoreLoader.loadNatives(operatingSystem, str));
    }

    public double cellArea(long j, AreaUnit areaUnit) {
        if (areaUnit == AreaUnit.rads2) {
            return this.h3Api.cellAreaRads2(j);
        }
        if (areaUnit == AreaUnit.km2) {
            return this.h3Api.cellAreaKm2(j);
        }
        if (areaUnit == AreaUnit.m2) {
            return this.h3Api.cellAreaM2(j);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid unit: %s", new Object[]{areaUnit}));
    }

    public double edgeLength(int i, LengthUnit lengthUnit) {
        checkResolution(i);
        if (lengthUnit == LengthUnit.km) {
            return this.h3Api.edgeLengthKm(i);
        }
        if (lengthUnit == LengthUnit.m) {
            return this.h3Api.edgeLengthM(i);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid unit: %s", new Object[]{lengthUnit}));
    }

    public double exactEdgeLength(long j, LengthUnit lengthUnit) {
        if (lengthUnit == LengthUnit.rads) {
            return this.h3Api.exactEdgeLengthRads(j);
        }
        if (lengthUnit == LengthUnit.km) {
            return this.h3Api.exactEdgeLengthKm(j);
        }
        if (lengthUnit == LengthUnit.m) {
            return this.h3Api.exactEdgeLengthM(j);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid unit: %s", new Object[]{lengthUnit}));
    }

    public CoordIJ experimentalH3ToLocalIj(long j, long j2) {
        int[] iArr = new int[2];
        int experimentalH3ToLocalIj = this.h3Api.experimentalH3ToLocalIj(j, j2, iArr);
        if (experimentalH3ToLocalIj != 0) {
            if (experimentalH3ToLocalIj != 1) {
                if (experimentalH3ToLocalIj != 3 && experimentalH3ToLocalIj != 4 && experimentalH3ToLocalIj != 5) {
                    throw new LocalIjUndefinedException("Local IJ coordinates undefined for this origin and index pair. The index may be too far from the origin.");
                }
                throw new PentagonEncounteredException("Encountered possible pentagon distortion");
            }
            throw new IllegalArgumentException("Incompatible origin and index.");
        }
        return new CoordIJ(iArr[0], iArr[1]);
    }

    public long experimentalLocalIjToH3(long j, CoordIJ coordIJ) {
        long experimentalLocalIjToH3 = this.h3Api.experimentalLocalIjToH3(j, coordIJ.i, coordIJ.j);
        if (experimentalLocalIjToH3 != 0) {
            return experimentalLocalIjToH3;
        }
        throw new LocalIjUndefinedException("Index not defined for this origin and IJ coordinates pair. IJ coordinates may be too far from origin, or pentagon distortion was encountered.");
    }

    public long getH3UnidirectionalEdge(long j, long j2) {
        long h3UnidirectionalEdge = this.h3Api.getH3UnidirectionalEdge(j, j2);
        if (h3UnidirectionalEdge != 0) {
            return h3UnidirectionalEdge;
        }
        throw new IllegalArgumentException("Given indexes are not neighbors.");
    }

    public List<List<List<GeoCoord>>> h3AddressSetToMultiPolygon(Collection<String> collection, boolean z) {
        return h3SetToMultiPolygon(stringToH3List(collection), z);
    }

    public int h3Distance(long j, long j2) {
        int h3Distance = this.h3Api.h3Distance(j, j2);
        if (h3Distance >= 0) {
            return h3Distance;
        }
        throw new DistanceUndefinedException("Distance not defined between the two indexes.");
    }

    public boolean h3IndexesAreNeighbors(String str, String str2) {
        return h3IndexesAreNeighbors(stringToH3(str), stringToH3(str2));
    }

    public List<Long> h3Line(long j, long j2) {
        int h3LineSize = this.h3Api.h3LineSize(j, j2);
        if (h3LineSize >= 0) {
            long[] jArr = new long[h3LineSize];
            if (this.h3Api.h3Line(j, j2, jArr) == 0) {
                return nonZeroLongArrayToList(jArr);
            }
            throw new LineUndefinedException("Could not compute line between cells");
        }
        throw new LineUndefinedException("Could not compute line size between cells");
    }

    public List<List<List<GeoCoord>>> h3SetToMultiPolygon(Collection<Long> collection, boolean z) {
        long[] collectionToLongArray = collectionToLongArray(collection);
        ArrayList<List<List<GeoCoord>>> arrayList = new ArrayList<>();
        this.h3Api.h3SetToLinkedGeo(collectionToLongArray, arrayList);
        Iterator<List<List<GeoCoord>>> it = arrayList.iterator();
        while (it.hasNext()) {
            for (List list : it.next()) {
                for (int i = 0; i < list.size(); i++) {
                    GeoCoord geoCoord = (GeoCoord) ListProtector.get(list, i);
                    ListProtector.set(list, i, new GeoCoord(Math.toDegrees(geoCoord.lat), Math.toDegrees(geoCoord.lng)));
                }
                if (z && list.size() > 0) {
                    list.add(ListProtector.get(list, 0));
                }
            }
        }
        return arrayList;
    }

    public long h3ToCenterChild(long j, int i) {
        checkResolution(i);
        long h3ToCenterChild = this.h3Api.h3ToCenterChild(j, i);
        if (h3ToCenterChild != 0) {
            return h3ToCenterChild;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("childRes %d must be between %d and 15, inclusive", new Object[]{Integer.valueOf(i), Integer.valueOf(h3GetResolution(j))}));
    }

    public List<Long> h3ToChildren(long j, int i) {
        checkResolution(i);
        long[] jArr = new long[this.h3Api.maxH3ToChildrenSize(j, i)];
        this.h3Api.h3ToChildren(j, i, jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public long h3ToParent(long j, int i) {
        int i2 = (int) ((67553994410557440L & j) >> 52);
        if (i >= 0 && i <= i2) {
            if (i == i2) {
                return j;
            }
            long j2 = i << 52;
            long j3 = 35184372088831L;
            for (int i3 = 0; i3 < i; i3++) {
                j3 >>= 3;
            }
            return (j & (-67553994410557441L)) | j2 | j3;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("res (%d) must be between 0 and %d, inclusive", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public String h3ToParentAddress(String str, int i) {
        return h3ToString(h3ToParent(stringToH3(str), i));
    }

    public double hexArea(int i, AreaUnit areaUnit) {
        checkResolution(i);
        if (areaUnit == AreaUnit.km2) {
            return this.h3Api.hexAreaKm2(i);
        }
        if (areaUnit == AreaUnit.m2) {
            return this.h3Api.hexAreaM2(i);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid unit: %s", new Object[]{areaUnit}));
    }

    public List<List<Long>> hexRange(long j, int i) {
        int maxKringSize = this.h3Api.maxKringSize(i);
        long[] jArr = new long[maxKringSize];
        if (this.h3Api.hexRange(j, i, jArr) == 0) {
            ArrayList arrayList = new ArrayList(i + 1);
            ArrayList arrayList2 = null;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < maxKringSize; i4++) {
                if (i4 == i2) {
                    arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                    if (i3 == 0) {
                        i2 = 1;
                    } else {
                        i2 += i3 * 6;
                    }
                    i3++;
                }
                arrayList2.add(Long.valueOf(jArr[i4]));
            }
            return arrayList;
        }
        throw new PentagonEncounteredException("A pentagon was encountered while computing hexRange.");
    }

    public List<Long> hexRing(long j, int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = i * 6;
        }
        long[] jArr = new long[i2];
        if (this.h3Api.hexRing(j, i, jArr) == 0) {
            return nonZeroLongArrayToList(jArr);
        }
        throw new PentagonEncounteredException("A pentagon was encountered while computing hexRing.");
    }

    public List<Long> kRing(long j, int i) {
        long[] jArr = new long[this.h3Api.maxKringSize(i)];
        this.h3Api.kRing(j, i, jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public List<List<Long>> kRingDistances(long j, int i) {
        int maxKringSize = this.h3Api.maxKringSize(i);
        long[] jArr = new long[maxKringSize];
        int[] iArr = new int[maxKringSize];
        this.h3Api.kRingDistances(j, i, jArr, iArr);
        ArrayList arrayList = new ArrayList(i + 1);
        for (int i2 = 0; i2 <= i; i2++) {
            arrayList.add(new ArrayList());
        }
        for (int i3 = 0; i3 < maxKringSize; i3++) {
            long j2 = jArr[i3];
            if (j2 != 0) {
                ((List) ListProtector.get(arrayList, iArr[i3])).add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    public List<List<String>> kRings(String str, int i) {
        ArrayList arrayList = new ArrayList(i + 1);
        arrayList.add(Collections.singletonList(str));
        for (int i2 = 1; i2 <= i; i2++) {
            arrayList.add(kRing(str, i2));
        }
        return arrayList;
    }

    public List<Long> uncompact(Collection<Long> collection, int i) {
        checkResolution(i);
        long[] collectionToLongArray = collectionToLongArray(collection);
        long[] jArr = new long[this.h3Api.maxUncompactSize(collectionToLongArray, i)];
        if (this.h3Api.uncompact(collectionToLongArray, i, jArr) == 0) {
            return nonZeroLongArrayToList(jArr);
        }
        throw new IllegalArgumentException("Bad input to uncompact");
    }

    public List<String> uncompactAddress(Collection<String> collection, int i) {
        return h3ToStringList(uncompact(stringToH3List(collection), i));
    }

    public double cellArea(String str, AreaUnit areaUnit) {
        return cellArea(stringToH3(str), areaUnit);
    }

    public double exactEdgeLength(String str, LengthUnit lengthUnit) {
        return exactEdgeLength(stringToH3(str), lengthUnit);
    }

    public CoordIJ experimentalH3ToLocalIj(String str, String str2) {
        return experimentalH3ToLocalIj(stringToH3(str), stringToH3(str2));
    }

    public String experimentalLocalIjToH3(String str, CoordIJ coordIJ) {
        return h3ToString(experimentalLocalIjToH3(stringToH3(str), coordIJ));
    }

    public String getH3UnidirectionalEdge(String str, String str2) {
        return h3ToString(getH3UnidirectionalEdge(stringToH3(str), stringToH3(str2)));
    }

    public int h3Distance(String str, String str2) {
        return h3Distance(stringToH3(str), stringToH3(str2));
    }

    public boolean h3IndexesAreNeighbors(long j, long j2) {
        return this.h3Api.h3IndexesAreNeighbors(j, j2);
    }

    public List<String> h3Line(String str, String str2) {
        return h3ToStringList(h3Line(stringToH3(str), stringToH3(str2)));
    }

    public String h3ToCenterChild(String str, int i) {
        return h3ToString(h3ToCenterChild(stringToH3(str), i));
    }

    public List<String> h3ToChildren(String str, int i) {
        return h3ToStringList(h3ToChildren(stringToH3(str), i));
    }

    public List<List<String>> hexRange(String str, int i) {
        return (List) hexRange(stringToH3(str), i).stream().map(new C91038ZoA(this)).collect(Collectors.toList());
    }

    public List<String> hexRing(String str, int i) {
        return h3ToStringList(hexRing(stringToH3(str), i));
    }

    public List<String> kRing(String str, int i) {
        return h3ToStringList(kRing(stringToH3(str), i));
    }

    public List<List<String>> kRingDistances(String str, int i) {
        return (List) kRingDistances(stringToH3(str), i).stream().map(new C91038ZoA(this)).collect(Collectors.toList());
    }

    public static int packGeofenceVertices(double[] dArr, List<GeoCoord> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            GeoCoord geoCoord = (GeoCoord) ListProtector.get(list, i2);
            int i3 = i2 * 2;
            dArr[i3 + i] = Math.toRadians(geoCoord.lat);
            dArr[i3 + 1 + i] = Math.toRadians(geoCoord.lng);
        }
        return (list.size() * 2) + i;
    }

    public long geoToH3(double d, double d2, int i) {
        checkResolution(i);
        long geoToH3 = this.h3Api.geoToH3(Math.toRadians(d), Math.toRadians(d2), i);
        if (geoToH3 != 0) {
            return geoToH3;
        }
        throw new IllegalArgumentException("Latitude or longitude were invalid.");
    }

    public String geoToH3Address(double d, double d2, int i) {
        return h3ToString(geoToH3(d, d2, i));
    }

    public double pointDist(GeoCoord geoCoord, GeoCoord geoCoord2, LengthUnit lengthUnit) {
        double radians = Math.toRadians(geoCoord.lat);
        double radians2 = Math.toRadians(geoCoord.lng);
        double radians3 = Math.toRadians(geoCoord2.lat);
        double radians4 = Math.toRadians(geoCoord2.lng);
        if (lengthUnit == LengthUnit.rads) {
            return this.h3Api.pointDistRads(radians, radians2, radians3, radians4);
        }
        if (lengthUnit == LengthUnit.km) {
            return this.h3Api.pointDistKm(radians, radians2, radians3, radians4);
        }
        if (lengthUnit == LengthUnit.m) {
            return this.h3Api.pointDistM(radians, radians2, radians3, radians4);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid unit: %s", new Object[]{lengthUnit}));
    }

    public List<Long> polyfill(List<GeoCoord> list, List<List<GeoCoord>> list2, int i) {
        checkResolution(i);
        double[] dArr = new double[list.size() * 2];
        packGeofenceVertices(dArr, list, 0);
        int[] iArr = new int[0];
        double[] dArr2 = new double[0];
        if (list2 != null) {
            iArr = new int[list2.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                i2 += ((List) ListProtector.get(list2, i3)).size() * 2;
                iArr[i3] = ((List) ListProtector.get(list2, i3)).size() * 2;
            }
            dArr2 = new double[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < list2.size(); i5++) {
                i4 = packGeofenceVertices(dArr2, (List) ListProtector.get(list2, i5), i4);
            }
        }
        long[] jArr = new long[this.h3Api.maxPolyfillSize(dArr, iArr, dArr2, i)];
        this.h3Api.polyfill(dArr, iArr, dArr2, i, jArr);
        return nonZeroLongArrayToList(jArr);
    }

    public List<String> polyfillAddress(List<GeoCoord> list, List<List<GeoCoord>> list2, int i) {
        return h3ToStringList(polyfill(list, list2, i));
    }
}
